class Solution {
    public Node sortedInsert(Node head, int data) {
        // code here
        Node node = new Node(data);
        if(head==null){node.next=node;return node;}
        if(head.data>=node.data){int temp = node.data;
            node.data = head.data;
            head.data = temp;
            node.next = head.next;
            head.next = node;
            return head;}
        Node temp=head;
        Node temp2=head.next;
        int count=1;
        while(temp2!=head){
            count++;
            temp2=temp2.next;
        }
        temp2=head.next;
        for(int i=0;i<count;i++){
            if(temp.data<=data&&data<=temp2.data){
                temp.next=node;
                node.next=temp2;
                break;
            }
            else if(i==(count-1)){
                temp.next=node;
                node.next=temp2;
                break;
            }
            temp=temp.next;
            temp2=temp2.next;
        }
        return head;
    }
}
