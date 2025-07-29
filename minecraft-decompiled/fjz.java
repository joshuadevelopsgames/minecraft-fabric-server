import com.mojang.serialization.Codec;
import io.netty.buffer.ByteBuf;
import java.util.Collection;
import java.util.function.IntFunction;
import javax.annotation.Nullable;

public abstract class fjz {
   public boolean a(@Nullable fjz $$0) {
      return $$0 == null ? false : this == $$0;
   }

   public abstract String c();

   public abstract yc d(xo var1);

   public abstract boolean j();

   public abstract boolean i();

   public abstract fjz.b k();

   public abstract o o();

   public abstract Collection<String> h();

   public abstract fjz.b l();

   public abstract fjz.a m();

   public static enum a implements bda {
      a("always", 0),
      b("never", 1),
      c("pushOtherTeams", 2),
      d("pushOwnTeam", 3);

      public static final Codec<fjz.a> e = bda.a(fjz.a::values);
      private static final IntFunction<fjz.a> i = baq.a($$0 -> $$0.h, values(), baq.a.a);
      public static final zm<ByteBuf, fjz.a> f = zk.a(i, $$0 -> $$0.h);
      public final String g;
      public final int h;

      private a(final String $$0, final int $$1) {
         this.g = $$0;
         this.h = $$1;
      }

      public xo a() {
         return xo.c("team.collision." + this.g);
      }

      @Override
      public String c() {
         return this.g;
      }
   }

   public static enum b implements bda {
      a("always", 0),
      b("never", 1),
      c("hideForOtherTeams", 2),
      d("hideForOwnTeam", 3);

      public static final Codec<fjz.b> e = bda.a(fjz.b::values);
      private static final IntFunction<fjz.b> i = baq.a($$0 -> $$0.h, values(), baq.a.a);
      public static final zm<ByteBuf, fjz.b> f = zk.a(i, $$0 -> $$0.h);
      public final String g;
      public final int h;

      private b(final String $$0, final int $$1) {
         this.g = $$0;
         this.h = $$1;
      }

      public xo a() {
         return xo.c("team.visibility." + this.g);
      }

      @Override
      public String c() {
         return this.g;
      }
   }
}
