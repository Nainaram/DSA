public class pattern {
     static void pattern1(int n ){
        for(int i =1 ; i <=n;i++){
            for(int  j =1 ; j <=i;j++){
                System.out.print(j);
            }System.out.println();
         }
    }
    static void pattern2(int n){
        for(int i =1 ; i <=n;i++){
            for(int  j =1 ; j <=i;j++){
                System.out.print(i);
            }System.out.println();
         }
    }
    static void pattern3(int n){
        for(int i =1 ; i <=n;i++){
            for(int  j =1 ; j <=n-i+1;j++){
                System.out.print("* ");
            }System.out.println();
         }
    }
    static void pattern4(int n){
        for(int i =1 ; i <=n;i++){
            for(int  j =1 ; j <=n-i+1;j++){
                System.out.print(j);
            }System.out.println();
         }
    }
    static void pattern5(int n){
        for(int i =0 ; i <n;i++){
           
            for(int  j =0; j <n-i-1;j++){
                System.out.print(" ");
            }
            for(int  j =0 ; j <2*i+1;j++){
                System.out.print("*");
            }
            for(int  j =0 ; j <n-i-1;j++){
                System.out.print(" ");
            }System.out.println();
         }
    }
    static void pattern6(int n){
        for(int i =0 ; i <n;i++){
           
            for(int  j =0; j <i;j++){
                System.out.print(" ");
            }
            for(int  j =0 ; j <2*n-(2*i+1);j++){
                System.out.print("*");
            }
            for(int  j =0 ; j <i;j++){
                System.out.print(" ");
            }System.out.println();
         }
    }
    static void patterns8(int n){
        for( int i = 0; i < n;i++){
            for(int j = 0 ; j < n;j++){
                System.out.print("* ");
            }System.out.println() ;
        }
    }
    static void patterns7(int n){
        for(int i = 1; i <=2*n -1;i++){
            int stars = i;
            if(i > n){ stars = 2*n - i;}
            for( int j = 1; j<=stars;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    static void patterns9(int n){
        int starts=1;
        for(int  i = 0; i < n;i++){
            if(i%2==0){ starts  = 1;}
            else{
                starts = 0;
            }
            for(int j = 0; j <=i;j++ ){
                System.out.print(starts);
                starts = 1-starts;
            }System.out.println();
    }

    }
    static void patterns10(int n){
        int space =2*(n-1);
        for(int i = 1; i<=n;i++){
            for(int j = 1; j<=i; j++){
                System.out.print(j);
            }
            for(int j = 1; j<=space; j++){
                System.out.print(" ");}
            
            for(int j = i; j>=1; j--){
                System.out.print(j);
            }
            System.out.println();
            space -=2;
        }
    }    
    static void patterns11(int n){
      
        for(int i = 0;i<n;i++){
            for(char ch = 'A'; ch <='A' + i ; ch++) {
                System.out.print(ch + " ");
            } 
            
            System.out.println();
        }
    }
    static void patterns12(int n ){
        int num =1;
        for(int i = 1;i<=n;i++){
            for(int j = 1;j<=i;j++){
                System.out.print(num + " ");
                num = num+1;    
            }
            System.out.println();
        }
    }
    static void patterns13(int n){
      
        for(int i = 0;i<n;i++){
            for(char ch = 'A'; ch <='A' + (n-i-1) ; ch++) {
                System.out.print(ch + " ");
            } 
            
            System.out.println();
        }
    }
    static void patterns14(int n){
      for(int i = 0;i<n;i++){
            char ch =(char)('A'+ i);
            for(int j = 0; j <= i;j++){
                System.out.print(ch + " ");
                
            }
            System.out.println();
        }   
    }
    static void patterns15(int n){
        for(int i =0;i<n;i++){
            // spaces to print before the alphabet
            for(int j = 1;j<=n-i-1;j++){
                System.out.print(" ");
            }
            // printing the alphabets
            char ch = (char)('A');
            int breakpoint  =(2*i+1)/2;
            for(int j = 1;j<=2*i+1;j++){
                System.out.print(ch);
                if(j<=breakpoint){
                    ch++;
                }
                else{ch--;}
            }
            // spaces to print after the alphabets
            for(int j = 1;j<=n-i-1;j++){
                System.out.print(" ");
            }
                System.out.println(" ");
        }
    }
    static void patterns16(int n){
        for(int i =0; i<n;i++){
            for(char ch = (char)('E'-i);ch<='E';ch++){
                System.out.print(ch+ " ");
            }
            System.out.println();
        }
    }
    static void patterns17(int n){
        int iniS =0;
        for(int i = 0; i < n;i++){
            // this is to print stars 
            for(int j = 1; j<= n-i;j++){
                System.out.print("*");
            }
            // this is to print the spaces 
            for(int j = 0; j<=iniS;j++){
                System.out.print(" ");
            }
            // this is to print stars 
            for(int j = 1; j<= n-i;j++){
                System.out.print("*");
            }
            iniS+=2;
            System.out.println();
        }
    iniS =8;
    for(int i = 1; i <= n;i++){
        // this is to print stars 
        for(int j = 1; j<= i;j++){
            System.out.print("*");
        }
        // this is to print the spaces 
        for(int j = 0; j<=iniS;j++){
            System.out.print(" ");
        }
        // this is to print stars 
        for(int j = 1; j<= i;j++){
            System.out.print("*");
        }
        iniS-=2;
        System.out.println();
    }
}
static void patterns18(int n){
    int spaces =2*n-2;
    for(int i = 1;i<=2*n-1;i++){
        // this is the code for the stars
        int stars = i;
        if(i>n){stars = 2*n-i;}
        for(int j=1;j<=stars;j++){
            System.out.print("*");
        }
        // this is the code for the{} spaces
        for(int j =1;j<=spaces;j++){
            System.out.print(" ");
        }
        for(int j=1;j<=stars;j++){
            System.out.print("*");
        }
        if(i<n){spaces-=2;}
        else{        spaces +=2;}
        System.out.println();
        
        // this is the code for the stars
    }
}
static void patterns19(int n){
    for(int i = 0; i<n;i++){
        for(int j=0;j<n;j++){
            if(i==0||i==n-1||j==0||j==n-1){
                System.out.print("*");
            }
            else{
                System.out.print(" ");
            }
            
        }
        System.out.println();
    }
}
static void patterns20(int n){
    for(int i = 0; i<2*n-1;i++){
        for(int j = 0 ; j<2*n-1;j++){
            int top =i;
            int left=j;
            int right=(2*n-2)-j;
            int down = (2*n-2)-i;
        System.out.print(n-Math.min(Math.min(top,down) , Math.min(left,right)) + " "); 
       }
        System.out.println();
    }

}
    public static void main(String[] args) {
    int n =5; 
   
   // patterns10(n);
        patterns20(n);
   // patterns8(n);
    // pattern1(n);
    // pattern2(n);
    // pattern3(n);
    // pattern4(n);
    // pattern5(n);
    // pattern6(n);
}

}
