import com.google.common.base.Stopwatch;
import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.DynamicCommandExceptionType;
import com.mojang.datafixers.util.Pair;
import com.mojang.logging.LogUtils;
import java.time.Duration;
import java.util.Optional;
import org.slf4j.Logger;

public class aoy {
   private static final Logger a = LogUtils.getLogger();
   private static final DynamicCommandExceptionType b = new DynamicCommandExceptionType($$0 -> xo.b("commands.locate.structure.not_found", $$0));
   private static final DynamicCommandExceptionType c = new DynamicCommandExceptionType($$0 -> xo.b("commands.locate.structure.invalid", $$0));
   private static final DynamicCommandExceptionType d = new DynamicCommandExceptionType($$0 -> xo.b("commands.locate.biome.not_found", $$0));
   private static final DynamicCommandExceptionType e = new DynamicCommandExceptionType($$0 -> xo.b("commands.locate.poi.not_found", $$0));
   private static final int f = 100;
   private static final int g = 6400;
   private static final int h = 32;
   private static final int i = 64;
   private static final int j = 256;

   public static void a(CommandDispatcher<ek> $$0, eg $$1) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)el.b("locate").requires(el.a(2)))
                  .then(el.b("structure").then(el.a("structure", fq.a(mn.bj)).executes($$0x -> a((ek)$$0x.getSource(), fq.a($$0x, "structure", mn.bj, c))))))
               .then(el.b("biome").then(el.a("biome", fp.a($$1, mn.aK)).executes($$0x -> a((ek)$$0x.getSource(), fp.a($$0x, "biome", mn.aK))))))
            .then(el.b("poi").then(el.a("poi", fp.a($$1, mn.ad)).executes($$0x -> b((ek)$$0x.getSource(), fp.a($$0x, "poi", mn.ad)))))
      );
   }

   private static Optional<? extends jp.b<euy>> a(fq.c<euy> $$0, jy<euy> $$1) {
      return (Optional<? extends jp.b<euy>>)$$0.a().map($$1x -> $$1.a($$1x).map($$0xx -> jp.a($$0xx)), $$1::a);
   }

   private static int a(ek $$0, fq.c<euy> $$1) throws CommandSyntaxException {
      jy<euy> $$2 = $$0.e().K_().f(mn.bj);
      jp<euy> $$3 = (jp<euy>)a($$1, $$2).orElseThrow(() -> c.create($$1.b()));
      jb $$4 = jb.a((jv)$$0.d());
      aub $$5 = $$0.e();
      Stopwatch $$6 = Stopwatch.createStarted(ag.d);
      Pair<jb, jl<euy>> $$7 = $$5.n().g().a($$5, $$3, $$4, 100, false);
      $$6.stop();
      if ($$7 == null) {
         throw b.create($$1.b());
      } else {
         return a($$0, $$1, $$4, $$7, "commands.locate.structure.success", false, $$6.elapsed());
      }
   }

   private static int a(ek $$0, fp.c<dnx> $$1) throws CommandSyntaxException {
      jb $$2 = jb.a((jv)$$0.d());
      Stopwatch $$3 = Stopwatch.createStarted(ag.d);
      Pair<jb, jl<dnx>> $$4 = $$0.e().a($$1, $$2, 6400, 32, 64);
      $$3.stop();
      if ($$4 == null) {
         throw d.create($$1.b());
      } else {
         return a($$0, $$1, $$2, $$4, "commands.locate.biome.success", true, $$3.elapsed());
      }
   }

   private static int b(ek $$0, fp.c<cls> $$1) throws CommandSyntaxException {
      jb $$2 = jb.a((jv)$$0.d());
      aub $$3 = $$0.e();
      Stopwatch $$4 = Stopwatch.createStarted(ag.d);
      Optional<Pair<jl<cls>, jb>> $$5 = $$3.B().e($$1, $$2, 256, clp.b.c);
      $$4.stop();
      if ($$5.isEmpty()) {
         throw e.create($$1.b());
      } else {
         return a($$0, $$1, $$2, $$5.get().swap(), "commands.locate.poi.success", false, $$4.elapsed());
      }
   }

   public static int a(ek $$0, fp.c<?> $$1, jb $$2, Pair<jb, ? extends jl<?>> $$3, String $$4, boolean $$5, Duration $$6) {
      String $$7 = (String)$$1.a().map($$1x -> $$1.b(), $$2x -> $$1.b() + " (" + ((jl)$$3.getSecond()).g() + ")");
      return a($$0, $$2, $$3, $$4, $$5, $$7, $$6);
   }

   public static int a(ek $$0, fq.c<?> $$1, jb $$2, Pair<jb, ? extends jl<?>> $$3, String $$4, boolean $$5, Duration $$6) {
      String $$7 = (String)$$1.a().map($$0x -> $$0x.a().toString(), $$1x -> "#" + $$1x.b() + " (" + ((jl)$$3.getSecond()).g() + ")");
      return a($$0, $$2, $$3, $$4, $$5, $$7, $$6);
   }

   private static int a(ek $$0, jb $$1, Pair<jb, ? extends jl<?>> $$2, String $$3, boolean $$4, String $$5, Duration $$6) {
      jb $$7 = (jb)$$2.getFirst();
      int $$8 = $$4 ? bcb.d(bcb.c((float)$$1.j($$7))) : bcb.d(a($$1.u(), $$1.w(), $$7.u(), $$7.w()));
      String $$9 = $$4 ? String.valueOf($$7.v()) : "~";
      xo $$10 = xr.a((xo)xo.a("chat.coordinates", $$7.u(), $$9, $$7.w()))
         .a($$2x -> $$2x.a(o.k).a(new xm.i("/tp @s " + $$7.u() + " " + $$9 + " " + $$7.w())).a(new xu.e(xo.c("chat.coordinates.tooltip"))));
      $$0.a(() -> xo.a($$3, $$5, $$10, $$8), false);
      a.info("Locating element " + $$5 + " took " + $$6.toMillis() + " ms");
      return $$8;
   }

   private static float a(int $$0, int $$1, int $$2, int $$3) {
      int $$4 = $$2 - $$0;
      int $$5 = $$3 - $$1;
      return bcb.c((float)($$4 * $$4 + $$5 * $$5));
   }
}
