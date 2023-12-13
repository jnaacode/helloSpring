package hello.helloSpring.study;

public class StaticBlockCheck {

        public static void main(String args[]) {
            StaticBlockCheck check = new StaticBlockCheck();
            check.makeStaticBlockObject();
        }

        public void makeStaticBlockObject(){
            System.out.println("Creating bloack1");
            StaticBlock block1 = new StaticBlock();
            System.out.println("Created block1");
            System.out.println("_________________________-");
            System.out.println("Created bloack2");
            StaticBlock block2 = new StaticBlock();
            System.out.println("Created bloack2");
        }


}
