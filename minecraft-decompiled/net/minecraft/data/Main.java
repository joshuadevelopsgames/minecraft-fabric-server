package net.minecraft.data;

import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Collection;
import java.util.concurrent.CompletableFuture;
import java.util.function.BiFunction;
import joptsimple.OptionParser;
import joptsimple.OptionSet;
import joptsimple.OptionSpec;
import net.minecraft.obfuscate.DontObfuscate;

public class Main {
   @ad(
      a = "System.out needed before bootstrap"
   )
   @DontObfuscate
   public static void main(String[] $$0) throws IOException {
      ac.a();
      OptionParser $$1 = new OptionParser();
      OptionSpec<Void> $$2 = $$1.accepts("help", "Show the help menu").forHelp();
      OptionSpec<Void> $$3 = $$1.accepts("server", "Include server generators");
      OptionSpec<Void> $$4 = $$1.accepts("dev", "Include development tools");
      OptionSpec<Void> $$5 = $$1.accepts("reports", "Include data reports");
      $$1.accepts("validate", "Validate inputs");
      OptionSpec<Void> $$6 = $$1.accepts("all", "Include all generators");
      OptionSpec<String> $$7 = $$1.accepts("output", "Output folder").withRequiredArg().defaultsTo("generated", new String[0]);
      OptionSpec<String> $$8 = $$1.accepts("input", "Input folder").withRequiredArg();
      OptionSet $$9 = $$1.parse($$0);
      if (!$$9.has($$2) && $$9.hasOptions()) {
         Path $$10 = Paths.get((String)$$7.value($$9));
         boolean $$11 = $$9.has($$6);
         boolean $$12 = $$11 || $$9.has($$3);
         boolean $$13 = $$11 || $$9.has($$4);
         boolean $$14 = $$11 || $$9.has($$5);
         Collection<Path> $$15 = $$9.valuesOf($$8).stream().map($$0x -> Paths.get($$0x)).toList();
         ms $$16 = new ms($$10, ac.b(), true);
         a($$16, $$15, $$12, $$13, $$14);
         $$16.a();
      } else {
         $$1.printHelpOn(System.out);
      }
   }

   private static <T extends mt> mt.a<T> a(BiFunction<mv, CompletableFuture<jn.a>, T> $$0, CompletableFuture<jn.a> $$1) {
      return $$2 -> $$0.apply($$2, $$1);
   }

   public static void a(ms $$0, Collection<Path> $$1, boolean $$2, boolean $$3, boolean $$4) {
      ms.a $$5 = $$0.a($$2);
      $$5.a($$1x -> new pg($$1x, $$1).a(new ph()));
      CompletableFuture<jn.a> $$6 = CompletableFuture.supplyAsync(pc::a, ag.h());
      ms.a $$7 = $$0.a($$2);
      $$7.a(a(oz::new, $$6));
      $$7.a(a(mz::a, $$6));
      $$7.a(a(od::a, $$6));
      $$7.a(a(ox.a::new, $$6));
      qa<dpz> $$8 = $$7.a(a(qc::new, $$6));
      qa<dcr> $$9 = $$7.a(a(qe::new, $$6));
      qa<dnx> $$10 = $$7.a(a(pk::new, $$6));
      qa<eao> $$11 = $$7.a(a(pj::new, $$6));
      qa<euy> $$12 = $$7.a(a(py::new, $$6));
      $$7.a(a(pm::new, $$6));
      $$7.a(a(pn::new, $$6));
      $$7.a(a(pp::new, $$6));
      $$7.a(a(pq::new, $$6));
      $$7.a(a(pr::new, $$6));
      $$7.a(a(ps::new, $$6));
      $$7.a(a(pt::new, $$6));
      $$7.a(a(pw::new, $$6));
      $$7.a(a(px::new, $$6));
      $$7.a(a(qf::new, $$6));
      $$7.a(a(qd::new, $$6));
      $$7 = $$0.a($$3);
      $$7.a($$1x -> new pe($$1x, $$1));
      $$7 = $$0.a($$4);
      $$7.a(a(ng::new, $$6));
      $$7.a(a(nk::new, $$6));
      $$7.a(a(nh::new, $$6));
      $$7.a(a(ni::new, $$6));
      $$7.a(nm::new);
      $$7.a(nl::new);
      $$7.a(nj::new);
      CompletableFuture<kb.g> $$15 = pb.a($$6);
      CompletableFuture<jn.a> $$16 = $$15.thenApply(kb.g::b);
      ms.a $$17 = $$0.a($$2, "trade_rebalance");
      $$17.a(a(oz::new, $$16));
      $$17.a($$0x -> oh.a($$0x, xo.c("dataPack.trade_rebalance.description"), cyd.a(cyf.b)));
      $$17.a(a(nv::a, $$6));
      $$17.a(a(qb::new, $$6));
      $$7 = $$0.a($$2, "redstone_experiments");
      $$7.a($$0x -> oh.a($$0x, xo.c("dataPack.redstone_experiments.description"), cyd.a(cyf.c)));
      $$7 = $$0.a($$2, "minecart_improvements");
      $$7.a($$0x -> oh.a($$0x, xo.c("dataPack.minecart_improvements.description"), cyd.a(cyf.d)));
   }
}
