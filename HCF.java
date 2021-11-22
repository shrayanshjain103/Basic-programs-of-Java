class test{

    static int gcd(int n1,int n2){
        if(n2==0)
            return n1;
        int gcd = gcd(n2, n1 % n2);
        return gcd;
    }
    public static void main(String[] args) {
        int n1=60 , n2=54;
        System.out.println("The HCF of "+ n1 +" and "+ n2+" is "+gcd(n1,n2) );
        }
    }

