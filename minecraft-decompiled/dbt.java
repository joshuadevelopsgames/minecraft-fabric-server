import com.mojang.serialization.Codec;
import io.netty.buffer.ByteBuf;
import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap;
import java.util.Arrays;
import java.util.List;
import java.util.function.IntFunction;
import java.util.stream.Collectors;
import javax.annotation.Nullable;
import org.jetbrains.annotations.Contract;

public enum dbt implements bda {
   a(0, "white", 16383998, fap.i, 15790320, 16777215),
   b(1, "orange", 16351261, fap.p, 15435844, 16738335),
   c(2, "magenta", 13061821, fap.q, 12801229, 16711935),
   d(3, "light_blue", 3847130, fap.r, 6719955, 10141901),
   e(4, "yellow", 16701501, fap.s, 14602026, 16776960),
   f(5, "lime", 8439583, fap.t, 4312372, 12582656),
   g(6, "pink", 15961002, fap.u, 14188952, 16738740),
   h(7, "gray", 4673362, fap.v, 4408131, 8421504),
   i(8, "light_gray", 10329495, fap.w, 11250603, 13882323),
   j(9, "cyan", 1481884, fap.x, 2651799, 65535),
   k(10, "purple", 8991416, fap.y, 8073150, 10494192),
   l(11, "blue", 3949738, fap.z, 2437522, 255),
   m(12, "brown", 8606770, fap.A, 5320730, 9127187),
   n(13, "green", 6192150, fap.B, 3887386, 65280),
   o(14, "red", 11546150, fap.C, 11743532, 16711680),
   p(15, "black", 1908001, fap.D, 1973019, 0);

   private static final IntFunction<dbt> t = baq.a(dbt::a, values(), baq.a.a);
   private static final Int2ObjectOpenHashMap<dbt> u = new Int2ObjectOpenHashMap(
      Arrays.stream(values()).collect(Collectors.toMap($$0 -> $$0.z, $$0 -> (dbt)$$0))
   );
   public static final bda.a<dbt> q = bda.a(dbt::values);
   public static final zm<ByteBuf, dbt> r = zk.a(t, dbt::a);
   @Deprecated
   public static final Codec<dbt> s = Codec.BYTE.xmap(dbt::a, $$0 -> (byte)$$0.v);
   private final int v;
   private final String w;
   private final fap x;
   private final int y;
   private final int z;
   private final int A;

   private dbt(final int $$0, final String $$1, final int $$2, final fap $$3, final int $$4, final int $$5) {
      this.v = $$0;
      this.w = $$1;
      this.x = $$3;
      this.A = baj.f($$5);
      this.y = baj.f($$2);
      this.z = $$4;
   }

   public int a() {
      return this.v;
   }

   public String b() {
      return this.w;
   }

   public int d() {
      return this.y;
   }

   public fap e() {
      return this.x;
   }

   public int f() {
      return this.z;
   }

   public int g() {
      return this.A;
   }

   public static dbt a(int $$0) {
      return t.apply($$0);
   }

   @Nullable
   @Contract("_,!null->!null;_,null->_")
   public static dbt a(String $$0, @Nullable dbt $$1) {
      dbt $$2 = q.a($$0);
      return $$2 != null ? $$2 : $$1;
   }

   @Nullable
   public static dbt b(int $$0) {
      return (dbt)u.get($$0);
   }

   @Override
   public String toString() {
      return this.w;
   }

   @Override
   public String c() {
      return this.w;
   }

   public static dbt a(aub $$0, dbt $$1, dbt $$2) {
      dha $$3 = a($$1, $$2);
      return $$0.u()
         .a(dhx.a, $$3, $$0)
         .map($$2x -> ((dhb)$$2x.b()).a($$3, $$0.K_()))
         .map(dcv::h)
         .filter(dbu.class::isInstance)
         .map(dbu.class::cast)
         .map(dbu::a)
         .orElseGet(() -> $$0.A.h() ? $$1 : $$2);
   }

   private static dha a(dbt $$0, dbt $$1) {
      return dha.a(2, 1, List.of(new dcv(dbu.a($$0)), new dcv(dbu.a($$1))));
   }
}
