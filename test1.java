public class test1 {
   public static void main(String[] args){ 
       System.out.println("MIN and MAX Values:");
       System.out.println("Byte MIN:"+Byte.MIN_VALUE+",MAX:"+Byte.MAX_VALUE);
       System.out.println("Short MIN:"+Short.MIN_VALUE+",MAX:"+Short.MAX_VALUE);
      System.out.println("Int MIN:"+Integer.MIN_VALUE+",MAX:"+Integer.MAX_VALUE);
      System.out.println("Long MIN:"+Long.MIN_VALUE+",MAX:"+Long.MAX_VALUE); 
      System.out.println("Float MIN:"+Float.MIN_VALUE+",MAX:"+Float.MAX_VALUE);  
      System.out.println("Double MIN:"+Double.MIN_VALUE+",MAX:"+Double.MAX_VALUE); 
      System.out.println("\nDefault Values(Initialized manually since primitives don't have defaults outside classes):");
      byte defaultByte = 0;
      short defaultShort = 0;
      int defaultInt = 0;
      long defaultLong = 0L;
      float defaultFloat = 0.0f;
      double defaultDouble = 0.0d;
      System.out.println("Default byte:"+defaultByte);
     System.out.println("Default short:"+defaultShort);
     System.out.println("Default int:"+defaultInt);
     System.out.println("Default long:"+defaultLong);
     System.out.println("Default float:"+defaultFloat);
     System.out.println("Default double:"+defaultDouble);
   }   
}
