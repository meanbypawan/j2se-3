/*
  c/c++
  char x = 'A';
  1. 1-byte
  2. 2^8 = 256
  3. ASCII
  Java:-
  char x = 'A';
  1. 2-byte
  2. 2^16 == 65536
  3. Unicode[16-bit hexa decimal]
 */
class TestMain{
    public static void main(String args[]){
       char ch1 = 'A';
       char ch3 = (char)(ch1 + 32);
       /*
          ch3 = ch1 + ch2
                65 + 66
          ch3 = 132
        */
       System.out.println(ch3);
    }
}