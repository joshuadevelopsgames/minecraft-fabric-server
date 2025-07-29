import com.mojang.serialization.Codec;
import io.netty.buffer.ByteBuf;
import java.util.Arrays;
import java.util.function.IntFunction;
import javax.annotation.Nullable;
import org.jetbrains.annotations.Contract;

public enum dmr implements bda {
   a(0, "survival"),
   b(1, "creative"),
   c(2, "adventure"),
   d(3, "spectator");

   public static final dmr e = a;
   public static final bda.a<dmr> f = bda.a(dmr::values);
   private static final IntFunction<dmr> i = baq.a(dmr::a, values(), baq.a.a);
   public static final zm<ByteBuf, dmr> g = zk.a(i, dmr::a);
   @Deprecated
   public static final Codec<dmr> h = Codec.INT.xmap(dmr::a, dmr::a);
   private static final int j = -1;
   private final int k;
   private final String l;
   private final xo m;
   private final xo n;

   private dmr(final int $$0, final String $$1) {
      this.k = $$0;
      this.l = $$1;
      this.m = xo.c("selectWorld.gameMode." + $$1);
      this.n = xo.c("gameMode." + $$1);
   }

   public int a() {
      return this.k;
   }

   public String b() {
      return this.l;
   }

   @Override
   public String c() {
      return this.l;
   }

   public xo d() {
      return this.n;
   }

   public xo e() {
      return this.m;
   }

   public void a(cup $$0) {
      if (this == b) {
         $$0.c = true;
         $$0.d = true;
         $$0.a = true;
      } else if (this == d) {
         $$0.c = true;
         $$0.d = false;
         $$0.a = true;
         $$0.b = true;
      } else {
         $$0.c = false;
         $$0.d = false;
         $$0.a = false;
         $$0.b = false;
      }

      $$0.e = !this.f();
   }

   public boolean f() {
      return this == c || this == d;
   }

   public boolean g() {
      return this == b;
   }

   public boolean h() {
      return this == a || this == c;
   }

   public static dmr a(int $$0) {
      return i.apply($$0);
   }

   public static dmr a(String $$0) {
      return a($$0, a);
   }

   @Nullable
   @Contract("_,!null->!null;_,null->_")
   public static dmr a(String $$0, @Nullable dmr $$1) {
      dmr $$2 = f.a($$0);
      return $$2 != null ? $$2 : $$1;
   }

   public static int a(@Nullable dmr $$0) {
      return $$0 != null ? $$0.k : -1;
   }

   @Nullable
   public static dmr b(int $$0) {
      return $$0 == -1 ? null : a($$0);
   }

   public static boolean c(int $$0) {
      return Arrays.stream(values()).anyMatch($$1 -> $$1.k == $$0);
   }
}
