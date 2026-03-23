package String.n11720;

interface Test{static void main(String[]s)
{var v=new java.util.Scanner(System.in);
int n=v.nextInt(),a=0;
for(var t=v.next(); n-->0; a+=t.charAt(n)-48);
System.out.print(a);
}
}