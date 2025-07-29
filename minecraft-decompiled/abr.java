import java.util.List;

public record abr(List<jb> c) implements abe {
   public static final zm<wg, abr> a = abe.a(abr::a, abr::new);
   public static final abe.b<abr> b = abe.a("debug/raids");

   private abr(wg $$0) {
      this($$0.a(jb.b));
   }

   private void a(wg $$0) {
      $$0.a(this.c, jb.b);
   }

   @Override
   public abe.b<abr> a() {
      return b;
   }

   public List<jb> b() {
      return this.c;
   }
}
