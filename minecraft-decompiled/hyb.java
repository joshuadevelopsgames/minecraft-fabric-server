import java.util.function.Function;

public enum hyb {
   a("movement", hxw::new),
   b("find_tree", hxv::new),
   c("punch_tree", hxy::new),
   d("open_inventory", hxx::new),
   e("craft_planks", hxu::new),
   f("none", hxt::new);

   private final String g;
   private final Function<hxz, ? extends hya> h;

   private <T extends hya> hyb(final String $$0, final Function<hxz, T> $$1) {
      this.g = $$0;
      this.h = $$1;
   }

   public hya a(hxz $$0) {
      return this.h.apply($$0);
   }

   public String a() {
      return this.g;
   }

   public static hyb a(String $$0) {
      for (hyb $$1 : values()) {
         if ($$1.g.equals($$0)) {
            return $$1;
         }
      }

      return f;
   }
}
