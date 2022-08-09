public class Main {
    public static void main(String[] args) {
        int start = 700;
        int add = 5000;
        int sum = add + start;
        boolean addedThousand = true;

        int result = addedThousand ? (sum - start) / 100 : 0;
        System.out.println(result + " : Ваши новые бонусы");
        System.out.println(sum + " (руб) : Ваш текущий счет");
    }
}

