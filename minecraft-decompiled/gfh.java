import java.util.List;
import java.util.stream.Stream;
import javax.annotation.Nullable;

public abstract class gfh<T extends arp> extends gfl<T> {
   public static final int a = 5;

   public gfh(@Nullable get $$0, T $$1, gfi $$2) {
      super($$0, $$1, $$2);
   }

   protected void a(gbo $$0, gfj $$1, T $$2, gfi $$3) {
      super.a($$0, $$1, $$2, $$3);
      List<fxo> $$4 = this.a($$2, $$3).map($$1x -> $$1.a($$1x).a()).toList();
      $$0.a(a($$4, $$2.b()));
   }

   protected abstract Stream<aro> a(T var1, gfi var2);

   protected void a(gbk $$0, gfj $$1, T $$2, gfi $$3) {
      super.a($$0, $$1, $$2, $$3);
      $$2.c().ifPresentOrElse($$2x -> $$0.b($$1.a($$2x).a()), () -> $$0.a(5));
   }
}
