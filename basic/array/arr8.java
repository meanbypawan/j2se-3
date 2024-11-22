class TestMain{
    public static void main(String args[]){
        int x[][] = {
            {10,20},
            {40,50,60,70,80,9,2},
            {70,80,90,87}
        };

        for(int row[] : x){
          for(int element : row)
           System.out.print("  "+element);
          System.out.println(); 
        }
        /*
        for(int r=0; r<x.length; r++){
         for(int c=0; c<x[r].length; c++){
            System.out.print("  "+x[r][c]);
         }
         System.out.println();
       }
       */
    }
}