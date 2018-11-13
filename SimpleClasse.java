public class SimpleClasse {
    public int somme(int a , int b){
        return a+b;
    }

    public static void main(String[] args) {
        SimpleClasse sc = new SimpleClasse();
        int a = 6;
        int b = 1;

        System.out.println("la somme est "+sc.somme(a,b));
    }
}