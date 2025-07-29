public class cwn {
   public static final cwn a = a("core");
   public static final cwn b = a("idle");
   public static final cwn c = a("work");
   public static final cwn d = a("play");
   public static final cwn e = a("rest");
   public static final cwn f = a("meet");
   public static final cwn g = a("panic");
   public static final cwn h = a("raid");
   public static final cwn i = a("pre_raid");
   public static final cwn j = a("hide");
   public static final cwn k = a("fight");
   public static final cwn l = a("celebrate");
   public static final cwn m = a("admire_item");
   public static final cwn n = a("avoid");
   public static final cwn o = a("ride");
   public static final cwn p = a("play_dead");
   public static final cwn q = a("long_jump");
   public static final cwn r = a("ram");
   public static final cwn s = a("tongue");
   public static final cwn t = a("swim");
   public static final cwn u = a("lay_spawn");
   public static final cwn v = a("sniff");
   public static final cwn w = a("investigate");
   public static final cwn x = a("roar");
   public static final cwn y = a("emerge");
   public static final cwn z = a("dig");
   private final String A;
   private final int B;

   private cwn(String $$0) {
      this.A = $$0;
      this.B = $$0.hashCode();
   }

   public String a() {
      return this.A;
   }

   private static cwn a(String $$0) {
      return jy.a(mm.C, $$0, new cwn($$0));
   }

   @Override
   public boolean equals(Object $$0) {
      if (this == $$0) {
         return true;
      } else if ($$0 != null && this.getClass() == $$0.getClass()) {
         cwn $$1 = (cwn)$$0;
         return this.A.equals($$1.A);
      } else {
         return false;
      }
   }

   @Override
   public int hashCode() {
      return this.B;
   }

   @Override
   public String toString() {
      return this.a();
   }
}
