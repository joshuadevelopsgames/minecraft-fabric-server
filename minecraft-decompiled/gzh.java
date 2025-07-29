import java.util.List;
import javax.annotation.Nullable;

public record gzh(huj a, boolean b, hrs c) implements gzb {
   public static gzh a(huc $$0, ame $$1, hui $$2) {
      hul $$3 = $$0.a($$1);
      gzk $$4 = $$3.g();
      boolean $$5 = $$3.c();
      hrs $$6 = $$3.a($$4, $$0);
      huj $$7 = $$3.a($$4, $$0, $$2);
      return new gzh($$7, $$5, $$6);
   }

   @Override
   public List<gyv> a(@Nullable jh $$0) {
      return this.a.a($$0);
   }

   public huj c() {
      return this.a;
   }

   @Override
   public boolean a() {
      return this.b;
   }

   @Override
   public hrs b() {
      return this.c;
   }
}
