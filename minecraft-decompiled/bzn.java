import java.util.List;

public enum bzn {
   a(bzn.a.c),
   b(bzn.a.b),
   c(bzn.a.c),
   d(bzn.a.d);

   private final bzn.a e;

   private bzn(final bzn.a $$0) {
      this.e = $$0;
   }

   public List<fis> a(float $$0, float $$1) {
      return this.e.create($$0, $$1);
   }

   public interface a {
      List<fis> a = List.of(fis.c);
      bzn.a b = ($$0, $$1) -> a;
      bzn.a c = ($$0, $$1) -> List.of(new fis(0.0, $$1, 0.0));
      bzn.a d = ($$0, $$1) -> List.of(new fis(0.0, $$1 / 2.0, 0.0));

      List<fis> create(float var1, float var2);
   }
}
