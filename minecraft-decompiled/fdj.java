import com.google.common.collect.Sets;
import java.util.Optional;
import java.util.Set;
import java.util.function.Consumer;
import javax.annotation.Nullable;
import net.minecraft.server.MinecraftServer;

public class fdj {
   private final fdm a;
   private final bck b;
   private final jm.a c;
   private final Set<fdj.c<?>> d = Sets.newLinkedHashSet();

   fdj(fdm $$0, bck $$1, jm.a $$2) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
   }

   public boolean a(bdn<?> $$0) {
      return this.a.b().a($$0);
   }

   public <T> T b(bdn<T> $$0) {
      return this.a.b().b($$0);
   }

   @Nullable
   public <T> T c(bdn<T> $$0) {
      return this.a.b().c($$0);
   }

   public void a(ame $$0, Consumer<dcv> $$1) {
      this.a.a($$0, $$1);
   }

   public boolean a(fdj.c<?> $$0) {
      return this.d.contains($$0);
   }

   public boolean b(fdj.c<?> $$0) {
      return this.d.add($$0);
   }

   public void c(fdj.c<?> $$0) {
      this.d.remove($$0);
   }

   public jm.a a() {
      return this.c;
   }

   public bck b() {
      return this.b;
   }

   public float c() {
      return this.a.c();
   }

   public aub d() {
      return this.a.a();
   }

   public static fdj.c<fdo> a(fdo $$0) {
      return new fdj.c<>(fdl.c, $$0);
   }

   public static fdj.c<fgs> a(fgs $$0) {
      return new fdj.c<>(fdl.a, $$0);
   }

   public static fdj.c<fex> a(fex $$0) {
      return new fdj.c<>(fdl.b, $$0);
   }

   public static class a {
      private final fdm a;
      @Nullable
      private bck b;

      public a(fdm $$0) {
         this.a = $$0;
      }

      public fdj.a a(long $$0) {
         if ($$0 != 0L) {
            this.b = bck.a($$0);
         }

         return this;
      }

      public fdj.a a(bck $$0) {
         this.b = $$0;
         return this;
      }

      public aub a() {
         return this.a.a();
      }

      public fdj a(Optional<ame> $$0) {
         aub $$1 = this.a();
         MinecraftServer $$2 = $$1.q();
         bck $$3 = Optional.ofNullable(this.b).or(() -> $$0.map($$1::a)).orElseGet($$1::H_);
         return new fdj(this.a, $$3, $$2.bc().a());
      }
   }

   public static enum b implements bda {
      a("this", fgd.a),
      b("attacker", fgd.d),
      c("direct_attacker", fgd.e),
      d("attacking_player", fgd.b);

      public static final bda.a<fdj.b> e = bda.a(fdj.b::values);
      private final String f;
      private final bdn<? extends bzm> g;

      private b(final String $$0, final bdn<? extends bzm> $$1) {
         this.f = $$0;
         this.g = $$1;
      }

      public bdn<? extends bzm> a() {
         return this.g;
      }

      public static fdj.b a(String $$0) {
         fdj.b $$1 = e.a($$0);
         if ($$1 != null) {
            return $$1;
         } else {
            throw new IllegalArgumentException("Invalid entity target " + $$0);
         }
      }

      @Override
      public String c() {
         return this.f;
      }
   }

   public record c<T>(fdl<T> a, T b) {
   }
}
