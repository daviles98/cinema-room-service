class Pumpkin {

    private boolean forHalloween;

    public Pumpkin(boolean forHalloween) {
        this.forHalloween = forHalloween;
    }

    void addCandle() {
        if (this.forHalloween) {
            new Candle().burning();
        } else {
            System.out.println("We don't need a candle.");
        }
    }

    class Candle {

        void burning() {
            System.out.println("The candle is burning! Boooooo!");
        }
    }
}

class Main {

    public static void main(String[] args) {
        int[] arr = {7,1,9,6,10,5,8,2,3,4};
        int t = 5;
        shift(arr, 5);
        System.out.println(funk(10));
    }

    /*
    function po(a, t):

    for j in [1, t]:
        x = a[1]
        for i in [1, len(a)-1]:
            a[i] = a[i+1]
        a[len(a)] = x

    for i in [1, len(a)]:
        if i == len(a) then
            print(a[i])
        else:
            print (a[i], ", ")


    po(a, 5)
 */
    static void shift(int[] arr, int t) {
        for(int j = 0; j < t; j++) {
            int x = arr[0];
            for(int i = 0; i < arr.length-1; i++) {
                arr[i] = arr[i+1];
            }
            arr[arr.length - 1] = x;
        }

        for(int i = 0; i < arr.length; i++) {
            if (i == arr.length-1) {
                System.out.println(arr[i]);
            } else {
                System.out.print(arr[i] + ", ");
            }
        }
    }

    /*
    * function funk(n):
    a = 1
    b = 1
    x = 0
    for j = [2, n - 1]:
        x = a + b
        a = b
        b = x
    return x
    * */
    static int funk(int n) {
        int a = 1;
        int b = 1;
        int x = 0;
        for (int i = 1; i < n-1; i++) {
            x = a + b;
            a = b;
            b = x;
        }
        return x;
    }
}