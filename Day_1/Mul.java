class Mul{

public static void mul(int n,int i)
{

if(i>10){
return ;
}
System.out.println(n+" x "+i+" = " + n*i);
mul(n,i+1);
}

public static void main(String[] args){


mul(4,1);



}


}