public class lesson16 {
    public static void main(String[] args) {
        double x = 2 ;
        lesson16 lesson16 = new lesson16();
        System.out.println(lesson16.sqrtGet(x));
    }

    public int sqrtGet(double x) {
        double k = 0;
        double maxSqrt = 0;
        double result = 0;
        double temp = 0;
        while (result != x && k < x / 2) {

            result = k * k;
            if(result < x){
                maxSqrt =  result;
                temp = k;
            }
            k++;
        }
        if (result == x) {
            return (int) result;
        }else {
            System.out.println("max " + maxSqrt);
            System.out.println("temp"+temp);
            double b = x - maxSqrt;
            System.out.println("b" +b);
            result = temp + (b/(2 * temp));
        }
//        for (int i = 0; i < x / 2; i++) {
//            {
//                maxSqrt = i * i;
//
//                if (k < maxSqrt && maxSqrt < x) {
//                    k = maxSqrt;
//                    double b = x - (k * k);
//                    result = k + (b / (2 * k));
//                } else if (i * i == x) {
//                    result = x;
//                    return (int) result;
//                }
//
//            }

        System.out.println(result);
        return (int) result;
    }
}
