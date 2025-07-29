import com.google.common.base.MoreObjects;
import com.google.common.collect.Multimap;
import com.mojang.authlib.GameProfile;
import java.util.Collection;
import java.util.EnumSet;
import java.util.List;
import java.util.Objects;
import java.util.UUID;
import javax.annotation.Nullable;

public class aex implements zw<acq> {
   public static final zm<wx, aex> a = zw.a(aex::a, aex::new);
   private final EnumSet<aex.a> b;
   private final List<aex.b> c;

   public aex(EnumSet<aex.a> $$0, Collection<auc> $$1) {
      this.b = $$0;
      this.c = $$1.stream().map(aex.b::new).toList();
   }

   public aex(aex.a $$0, auc $$1) {
      this.b = EnumSet.of($$0);
      this.c = List.of(new aex.b($$1));
   }

   public static aex a(Collection<auc> $$0) {
      EnumSet<aex.a> $$1 = EnumSet.of(aex.a.a, aex.a.b, aex.a.c, aex.a.d, aex.a.e, aex.a.f, aex.a.h, aex.a.g);
      return new aex($$1, $$0);
   }

   private aex(wx $$0) {
      this.b = $$0.a(aex.a.class);
      this.c = $$0.a($$0x -> {
         aex.c $$1 = new aex.c($$0x.n());

         for (aex.a $$2 : this.b) {
            $$2.i.read($$1, (wx)$$0x);
         }

         return $$1.a();
      });
   }

   private void a(wx $$0) {
      $$0.a(this.b, aex.a.class);
      $$0.a(this.c, ($$0x, $$1) -> {
         $$0x.a($$1.a());

         for (aex.a $$2 : this.b) {
            $$2.j.write((wx)$$0x, $$1);
         }
      });
   }

   @Override
   public zy<aex> a() {
      return ahk.ag;
   }

   public void a(acq $$0) {
      $$0.a(this);
   }

   public EnumSet<aex.a> b() {
      return this.b;
   }

   public List<aex.b> e() {
      return this.c;
   }

   public List<aex.b> f() {
      return this.b.contains(aex.a.a) ? this.c : List.of();
   }

   @Override
   public String toString() {
      return MoreObjects.toStringHelper(this).add("actions", this.b).add("entries", this.c).toString();
   }

   public static enum a {
      a(($$0, $$1) -> {
         GameProfile $$2 = new GameProfile($$0.a, $$1.d(16));
         $$2.getProperties().putAll((Multimap)zk.y.decode($$1));
         $$0.b = $$2;
      }, ($$0, $$1) -> {
         GameProfile $$2 = Objects.requireNonNull($$1.b());
         $$0.a($$2.getName(), 16);
         zk.y.encode($$0, $$2.getProperties());
      }),
      b(($$0, $$1) -> $$0.i = $$1.c(yf.a::a), ($$0, $$1) -> $$0.a($$1.i, yf.a::a)),
      c(($$0, $$1) -> $$0.e = dmr.a($$1.l()), ($$0, $$1) -> $$0.c($$1.e().a())),
      d(($$0, $$1) -> $$0.c = $$1.readBoolean(), ($$0, $$1) -> $$0.a($$1.c())),
      e(($$0, $$1) -> $$0.d = $$1.l(), ($$0, $$1) -> $$0.c($$1.d())),
      f(($$0, $$1) -> $$0.f = wg.a($$1, xq.d), ($$0, $$1) -> wg.a($$0, $$1.f(), xq.d)),
      g(($$0, $$1) -> $$0.h = $$1.l(), ($$0, $$1) -> $$0.c($$1.h)),
      h(($$0, $$1) -> $$0.g = $$1.readBoolean(), ($$0, $$1) -> $$0.a($$1.g));

      final aex.a.a i;
      final aex.a.b j;

      private a(final aex.a.a $$0, final aex.a.b $$1) {
         this.i = $$0;
         this.j = $$1;
      }

      public interface a {
         void read(aex.c var1, wx var2);
      }

      public interface b {
         void write(wx var1, aex.b var2);
      }
   }

   public record b(UUID a, @Nullable GameProfile b, boolean c, int d, dmr e, @Nullable xo f, boolean g, int h, @Nullable yf.a i) {

      b(auc $$0) {
         this($$0.cK(), $$0.gr(), true, $$0.g.k(), $$0.a(), $$0.O(), $$0.a(cuv.g), $$0.P(), y.a($$0.aa(), yf::a));
      }
   }

   static class c {
      final UUID a;
      @Nullable
      GameProfile b;
      boolean c;
      int d;
      dmr e;
      @Nullable
      xo f;
      boolean g;
      int h;
      @Nullable
      yf.a i;

      c(UUID $$0) {
         this.e = dmr.e;
         this.a = $$0;
      }

      aex.b a() {
         return new aex.b(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i);
      }
   }
}
