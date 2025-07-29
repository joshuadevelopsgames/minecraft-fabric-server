import com.mojang.serialization.Codec;

public class la {
   public static final kz.b<ky> a = a("damage", ky.a);
   public static final kz.b<lb.a> b = a("enchantments", lb.a.a);
   public static final kz.b<lb.b> c = a("stored_enchantments", lb.b.a);
   public static final kz.b<lf> d = a("potion_contents", lf.a);
   public static final kz.b<kx> e = a("custom_data", kx.a);
   public static final kz.b<kw> f = a("container", kw.a);
   public static final kz.b<kv> g = a("bundle_contents", kv.a);
   public static final kz.b<lc> h = a("firework_explosion", lc.a);
   public static final kz.b<ld> i = a("fireworks", ld.a);
   public static final kz.b<lh> j = a("writable_book_content", lh.a);
   public static final kz.b<li> k = a("written_book_content", li.a);
   public static final kz.b<ku> l = a("attribute_modifiers", ku.a);
   public static final kz.b<lg> m = a("trim", lg.a);
   public static final kz.b<le> n = a("jukebox_playable", le.a);

   private static <T extends kz> kz.b<T> a(String $$0, Codec<T> $$1) {
      return jy.a(mm.ao, $$0, new kz.b<>($$1));
   }

   public static kz.b<?> a(jy<kz.b<?>> $$0) {
      return a;
   }
}
