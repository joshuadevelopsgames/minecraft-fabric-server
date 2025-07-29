import com.mojang.serialization.MapCodec;
import java.util.function.ToIntFunction;

public class dto extends dvh implements dqc {
   public static final MapCodec<dto> a = b(dto::new);
   private final dvi e = new dvi(this);

   @Override
   public MapCodec<dto> a() {
      return a;
   }

   public dto(eea.d $$0) {
      super($$0);
   }

   public static ToIntFunction<eeb> b(int $$0) {
      return $$1 -> dvg.q($$1) ? $$0 : 0;
   }

   @Override
   public boolean a(dmx $$0, jb $$1, eeb $$2) {
      return jh.a().anyMatch($$3 -> this.e.a($$2, $$0, $$1, $$3.g()));
   }

   @Override
   public boolean a(dmu $$0, bck $$1, jb $$2, eeb $$3) {
      return true;
   }

   @Override
   public void a(aub $$0, bck $$1, jb $$2, eeb $$3) {
      this.e.a($$3, $$0, $$2, $$1);
   }

   @Override
   protected boolean e_(eeb $$0) {
      return $$0.y().c();
   }

   @Override
   public dvi c() {
      return this.e;
   }
}
