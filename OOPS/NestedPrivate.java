class NestedPrivate {
    private class Student{
        void display(){
            System.out.println("i am subhankar");
        }
    }
    void show(){
        Student s=new Student();
        s.display();
    }

    
    public static void main(String arggs[]){
        NestedPrivate c=new NestedPrivate();
        c.show();
    }
}
