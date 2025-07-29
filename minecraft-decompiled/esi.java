import com.mojang.serialization.Codec;
import it.unimi.dsi.fastutil.objects.ObjectArrayList;
import java.util.Comparator;
import java.util.Set;
import java.util.function.BiConsumer;
import java.util.function.Predicate;

public abstract class esi {
   public static final Codec<esi> h = mm.X.q().dispatch(esi::a, esj::a);

   protected abstract esj<?> a();

   public abstract void a(esi.a var1);

   public static final class a {
      private final dna a;
      private final BiConsumer<jb, eeb> b;
      private final bck c;
      private final ObjectArrayList<jb> d;
      private final ObjectArrayList<jb> e;
      private final ObjectArrayList<jb> f;

      public a(dna $$0, BiConsumer<jb, eeb> $$1, bck $$2, Set<jb> $$3, Set<jb> $$4, Set<jb> $$5) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
         this.f = new ObjectArrayList($$5);
         this.d = new ObjectArrayList($$3);
         this.e = new ObjectArrayList($$4);
         this.d.sort(Comparator.comparingInt(kg::v));
         this.e.sort(Comparator.comparingInt(kg::v));
         this.f.sort(Comparator.comparingInt(kg::v));
      }

      public void a(jb $$0, ees $$1) {
         this.a($$0, dqb.fx.m().b($$1, true));
      }

      public void a(jb $$0, eeb $$1) {
         this.b.accept($$0, $$1);
      }

      public boolean a(jb $$0) {
         return this.a.a($$0, eea.a::l);
      }

      public boolean a(jb $$0, Predicate<eeb> $$1) {
         return this.a.a($$0, $$1);
      }

      public dna a() {
         return this.a;
      }

      public bck b() {
         return this.c;
      }

      public ObjectArrayList<jb> c() {
         return this.d;
      }

      public ObjectArrayList<jb> d() {
         return this.e;
      }

      public ObjectArrayList<jb> e() {
         return this.f;
      }
   }
}
