public class Main {
    public static void main(String[] args) {
        Person thao = new Person();

        // Bien va Ham ko khai bao static thi can goi qua Obj(instance);
        thao.setName("Thao");
        thao.setAge(30);

        System.out.println(thao.toString());



    }
}
