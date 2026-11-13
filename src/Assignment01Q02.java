public class Assignment01Q02 {
    public static void main(String[] args) {
        double actualPi = Math.PI;
        double approxPi = 0;

        long n = Integer.parseInt(args[0]);
        long i = 1;
        while (i<=n){
            if (i%2==0){
                approxPi -= 1.0/(2*i-1);
            } else {
                approxPi += 1.0/(2*i-1);
            }
            i++;
        }
        approxPi = approxPi * 4;        
        System.out.println(approxPi + " " + actualPi);
    }
}
