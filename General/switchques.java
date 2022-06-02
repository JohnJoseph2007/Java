package General;
class switchques {
    public static void main(String[] args) {
        String name = "Trisha";
        switch(name) {
            case "John":
                System.out.println("John");
                break;
            case "Swayam": 
                System.out.println("Swayam");
            case "Aaryl": 
                System.out.println("Aaryl");
            case "Sanay": 
                System.out.print("Sanay");
                break;
            default:
                System.out.println("Impostor");
        }
        System.out.println("Hello world");
    }
}