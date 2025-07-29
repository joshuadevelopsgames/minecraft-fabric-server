import com.google.common.collect.UnmodifiableIterator;

public class fam {
   public static final fak a = a("empty", new fai());
   public static final faj b = a("flowing_water", new far.a());
   public static final faj c = a("water", new far.b());
   public static final faj d = a("flowing_lava", new fao.a());
   public static final faj e = a("lava", new fao.b());

   private static <T extends fak> T a(String $$0, T $$1) {
      return jy.a(mm.c, $$0, $$1);
   }

   static {
      for (fak $$0 : mm.c) {
         UnmodifiableIterator var2 = $$0.f().a().iterator();

         while (var2.hasNext()) {
            fal $$1 = (fal)var2.next();
            fak.c.b($$1);
         }
      }
   }
}
