import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.arguments.BoolArgumentType;
import com.mojang.brigadier.arguments.IntegerArgumentType;
import com.mojang.brigadier.arguments.StringArgumentType;
import com.mojang.brigadier.builder.ArgumentBuilder;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.Dynamic3CommandExceptionType;
import com.mojang.brigadier.exceptions.DynamicCommandExceptionType;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import com.mojang.brigadier.suggestion.Suggestions;
import com.mojang.brigadier.suggestion.SuggestionsBuilder;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Optional;
import java.util.concurrent.CompletableFuture;
import java.util.function.Function;
import java.util.stream.Stream;
import org.apache.commons.lang3.mutable.MutableInt;

public class ts {
   public static final int a = 15;
   public static final int b = 200;
   public static final int c = 10;
   public static final int d = 100;
   private static final int e = 200;
   private static final int f = 1024;
   private static final int g = 3;
   private static final int h = 10000;
   private static final int i = 5;
   private static final int j = 5;
   private static final int k = 5;
   private static final SimpleCommandExceptionType l = new SimpleCommandExceptionType(xo.c("commands.test.clear.error.no_tests"));
   private static final SimpleCommandExceptionType m = new SimpleCommandExceptionType(xo.c("commands.test.reset.error.no_tests"));
   private static final SimpleCommandExceptionType n = new SimpleCommandExceptionType(xo.c("commands.test.error.test_instance_not_found"));
   private static final SimpleCommandExceptionType o = new SimpleCommandExceptionType(xo.b("Could not find any structures to export"));
   private static final SimpleCommandExceptionType p = new SimpleCommandExceptionType(xo.c("commands.test.error.no_test_instances"));
   private static final Dynamic3CommandExceptionType q = new Dynamic3CommandExceptionType(
      ($$0, $$1, $$2) -> xo.b("commands.test.error.no_test_containing_pos", $$0, $$1, $$2)
   );
   private static final DynamicCommandExceptionType r = new DynamicCommandExceptionType($$0 -> xo.b("commands.test.error.too_large", $$0));

   private static int a(tv $$0) throws CommandSyntaxException {
      a();
      int $$1 = a($$0.b(), tp.a(), $$0).map($$1x -> a($$0.b(), $$1x)).toList().size();
      if ($$1 == 0) {
         throw l.create();
      } else {
         $$0.b().a(() -> xo.a("commands.test.reset.success", $$1), true);
         return $$1;
      }
   }

   private static int b(tv $$0) throws CommandSyntaxException {
      a();
      ek $$1 = $$0.b();
      aub $$2 = $$1.e();
      te.a($$2);
      List<euq> $$3 = $$0.findTestPos().flatMap($$1x -> $$2.a($$1x, ebb.U).stream()).map(ecu::d).toList();
      $$3.forEach($$1x -> tr.a($$1x, $$2));
      if ($$3.isEmpty()) {
         throw l.create();
      } else {
         $$1.a(() -> xo.a("commands.test.clear.success", $$3.size()), true);
         return $$3.size();
      }
   }

   private static int c(tv $$0) throws CommandSyntaxException {
      ek $$1 = $$0.b();
      aub $$2 = $$1.e();
      int $$3 = 0;
      boolean $$4 = true;

      for (Iterator<jb> $$5 = $$0.findTestPos().iterator(); $$5.hasNext(); $$3++) {
         jb $$6 = $$5.next();
         if (!($$2.c_($$6) instanceof ecu $$7)) {
            throw n.create();
         }

         if (!$$7.c($$1::a)) {
            $$4 = false;
         }
      }

      if ($$3 == 0) {
         throw o.create();
      } else {
         String $$8 = "Exported " + $$3 + " structures";
         $$0.b().a(() -> xo.b($$8), true);
         return $$4 ? 0 : 1;
      }
   }

   private static int d(tv $$0) {
      a();
      ek $$1 = $$0.b();
      aub $$2 = $$1.e();
      jb $$3 = a($$1);
      Collection<sz> $$4 = Stream.concat(a($$1, tp.a(), $$0), a($$1, tp.a(), $$0, 0)).toList();
      te.a($$2);
      so.b();
      Collection<ss> $$5 = new ArrayList<>();

      for (sz $$6 : $$4) {
         for (dwu $$7 : dwu.values()) {
            Collection<sz> $$8 = new ArrayList<>();

            for (int $$9 = 0; $$9 < 100; $$9++) {
               sz $$10 = new sz($$6.w(), $$7, $$2, new tp(1, true));
               $$10.a($$6.c());
               $$8.add($$10);
            }

            ss $$11 = st.a($$8, $$6.v().d(), $$7.ordinal());
            $$5.add($$11);
         }
      }

      tq $$12 = new tq($$3, 10, true);
      te $$13 = te.a.a($$5, $$2).a(st.a(100)).a((te.c)$$12).a($$12).a(true).a();
      return a($$1, $$13);
   }

   private static int a(tv $$0, tp $$1, int $$2, int $$3) {
      a();
      ek $$4 = $$0.b();
      aub $$5 = $$4.e();
      jb $$6 = a($$4);
      Collection<sz> $$7 = Stream.concat(a($$4, $$1, $$0), a($$4, $$1, $$0, $$2)).toList();
      if ($$7.isEmpty()) {
         $$4.a(() -> xo.c("commands.test.no_tests"), false);
         return 0;
      } else {
         te.a($$5);
         so.b();
         $$4.a(() -> xo.a("commands.test.run.running", $$7.size()), false);
         te $$8 = te.a.b($$7, $$5).a((te.c)(new tq($$6, $$3, false))).a();
         return a($$4, $$8);
      }
   }

   private static int e(tv $$0) throws CommandSyntaxException {
      $$0.b().a(xo.c("commands.test.locate.started"));
      MutableInt $$1 = new MutableInt(0);
      jb $$2 = jb.a((jv)$$0.b().d());
      $$0.findTestPos()
         .forEach(
            $$3x -> {
               if ($$0.b().e().c_($$3x) instanceof ecu $$5) {
                  jh var13 = $$5.w().a(jh.c);
                  jb $$8 = $$5.aA_().a(var13, 2);
                  int $$9 = (int)var13.g().p();
                  String $$10 = String.format(Locale.ROOT, "/tp @s %d %d %d %d 0", $$8.u(), $$8.v(), $$8.w(), $$9);
                  int $$11 = $$2.u() - $$3x.u();
                  int $$12 = $$2.w() - $$3x.w();
                  int $$13 = bcb.d(bcb.c((float)($$11 * $$11 + $$12 * $$12)));
                  yc $$14 = xr.a((xo)xo.a("chat.coordinates", $$3x.u(), $$3x.v(), $$3x.w()))
                     .a($$1xx -> $$1xx.a(o.k).a(new xm.i($$10)).a(new xu.e(xo.c("chat.coordinates.tooltip"))));
                  $$0.b().a(() -> xo.a("commands.test.locate.found", $$14, $$13), false);
                  $$1.increment();
               }
            }
         );
      int $$3 = $$1.intValue();
      if ($$3 == 0) {
         throw p.create();
      } else {
         $$0.b().a(() -> xo.a("commands.test.locate.done", $$3), true);
         return $$3;
      }
   }

   private static ArgumentBuilder<ek, ?> a(
      ArgumentBuilder<ek, ?> $$0, aos<CommandContext<ek>, tv> $$1, Function<ArgumentBuilder<ek, ?>, ArgumentBuilder<ek, ?>> $$2
   ) {
      return $$0.executes($$1x -> a($$1.apply($$1x), tp.a(), 0, 8))
         .then(
            ((RequiredArgumentBuilder)el.a("numberOfTimes", IntegerArgumentType.integer(0))
                  .executes($$1x -> a($$1.apply($$1x), new tp(IntegerArgumentType.getInteger($$1x, "numberOfTimes"), false), 0, 8)))
               .then(
                  $$2.apply(
                     el.a("untilFailed", BoolArgumentType.bool())
                        .executes(
                           $$1x -> a(
                              $$1.apply($$1x),
                              new tp(IntegerArgumentType.getInteger($$1x, "numberOfTimes"), BoolArgumentType.getBool($$1x, "untilFailed")),
                              0,
                              8
                           )
                        )
                  )
               )
         );
   }

   private static ArgumentBuilder<ek, ?> a(ArgumentBuilder<ek, ?> $$0, aos<CommandContext<ek>, tv> $$1) {
      return a($$0, $$1, $$0x -> $$0x);
   }

   private static ArgumentBuilder<ek, ?> b(ArgumentBuilder<ek, ?> $$0, aos<CommandContext<ek>, tv> $$1) {
      return a(
         $$0,
         $$1,
         $$1x -> $$1x.then(
            ((RequiredArgumentBuilder)el.a("rotationSteps", IntegerArgumentType.integer())
                  .executes(
                     $$1xx -> a(
                        $$1.apply($$1xx),
                        new tp(IntegerArgumentType.getInteger($$1xx, "numberOfTimes"), BoolArgumentType.getBool($$1xx, "untilFailed")),
                        IntegerArgumentType.getInteger($$1xx, "rotationSteps"),
                        8
                     )
                  ))
               .then(
                  el.a("testsPerRow", IntegerArgumentType.integer())
                     .executes(
                        $$1xx -> a(
                           $$1.apply($$1xx),
                           new tp(IntegerArgumentType.getInteger($$1xx, "numberOfTimes"), BoolArgumentType.getBool($$1xx, "untilFailed")),
                           IntegerArgumentType.getInteger($$1xx, "rotationSteps"),
                           IntegerArgumentType.getInteger($$1xx, "testsPerRow")
                        )
                     )
               )
         )
      );
   }

   public static void a(CommandDispatcher<ek> $$0, eg $$1) {
      ArgumentBuilder<ek, ?> $$2 = b(
         el.a("onlyRequiredTests", BoolArgumentType.bool()), $$0x -> tv.a().a($$0x, BoolArgumentType.getBool($$0x, "onlyRequiredTests"))
      );
      LiteralArgumentBuilder<ek> $$3 = (LiteralArgumentBuilder<ek>)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)el.b(
                                                               "test"
                                                            )
                                                            .requires(el.a(2)))
                                                         .then(
                                                            el.b("run").then(b(el.a("tests", fr.a($$1, mn.bm)), $$0x -> tv.a().a($$0x, fr.a($$0x, "tests"))))
                                                         ))
                                                      .then(
                                                         el.b("runmultiple")
                                                            .then(
                                                               ((RequiredArgumentBuilder)el.a("tests", fr.a($$1, mn.bm))
                                                                     .executes($$0x -> a(tv.a().a($$0x, fr.a($$0x, "tests")), tp.a(), 0, 8)))
                                                                  .then(
                                                                     el.a("amount", IntegerArgumentType.integer())
                                                                        .executes(
                                                                           $$0x -> a(
                                                                              tv.a()
                                                                                 .a(IntegerArgumentType.getInteger($$0x, "amount"))
                                                                                 .a($$0x, fr.a($$0x, "tests")),
                                                                              tp.a(),
                                                                              0,
                                                                              8
                                                                           )
                                                                        )
                                                                  )
                                                            )
                                                      ))
                                                   .then(a(el.b("runthese"), tv.a()::b)))
                                                .then(a(el.b("runclosest"), tv.a()::a)))
                                             .then(a(el.b("runthat"), tv.a()::c)))
                                          .then(b(el.b("runfailed").then($$2), tv.a()::d)))
                                       .then(el.b("verify").then(el.a("tests", fr.a($$1, mn.bm)).executes($$0x -> d(tv.a().a($$0x, fr.a($$0x, "tests")))))))
                                    .then(el.b("locate").then(el.a("tests", fr.a($$1, mn.bm)).executes($$0x -> e(tv.a().a($$0x, fr.a($$0x, "tests")))))))
                                 .then(el.b("resetclosest").executes($$0x -> a(tv.a().a($$0x)))))
                              .then(el.b("resetthese").executes($$0x -> a(tv.a().b($$0x)))))
                           .then(el.b("resetthat").executes($$0x -> a(tv.a().c($$0x)))))
                        .then(el.b("clearthat").executes($$0x -> b(tv.a().c($$0x)))))
                     .then(el.b("clearthese").executes($$0x -> b(tv.a().b($$0x)))))
                  .then(
                     ((LiteralArgumentBuilder)el.b("clearall").executes($$0x -> b(tv.a().a($$0x, 200))))
                        .then(
                           el.a("radius", IntegerArgumentType.integer())
                              .executes($$0x -> b(tv.a().a($$0x, bcb.a(IntegerArgumentType.getInteger($$0x, "radius"), 0, 1024))))
                        )
                  ))
               .then(el.b("stop").executes($$0x -> a())))
            .then(
               ((LiteralArgumentBuilder)el.b("pos").executes($$0x -> a((ek)$$0x.getSource(), "pos")))
                  .then(el.a("var", StringArgumentType.word()).executes($$0x -> a((ek)$$0x.getSource(), StringArgumentType.getString($$0x, "var"))))
            ))
         .then(
            el.b("create")
               .then(
                  ((RequiredArgumentBuilder)el.a("id", fn.a()).suggests(ts::a).executes($$0x -> a((ek)$$0x.getSource(), fn.a($$0x, "id"), 5, 5, 5)))
                     .then(
                        ((RequiredArgumentBuilder)el.a("width", IntegerArgumentType.integer())
                              .executes(
                                 $$0x -> a(
                                    (ek)$$0x.getSource(),
                                    fn.a($$0x, "id"),
                                    IntegerArgumentType.getInteger($$0x, "width"),
                                    IntegerArgumentType.getInteger($$0x, "width"),
                                    IntegerArgumentType.getInteger($$0x, "width")
                                 )
                              ))
                           .then(
                              el.a("height", IntegerArgumentType.integer())
                                 .then(
                                    el.a("depth", IntegerArgumentType.integer())
                                       .executes(
                                          $$0x -> a(
                                             (ek)$$0x.getSource(),
                                             fn.a($$0x, "id"),
                                             IntegerArgumentType.getInteger($$0x, "width"),
                                             IntegerArgumentType.getInteger($$0x, "height"),
                                             IntegerArgumentType.getInteger($$0x, "depth")
                                          )
                                       )
                                 )
                           )
                     )
               )
         );
      if (ac.aZ) {
         $$3 = (LiteralArgumentBuilder<ek>)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)$$3.then(
                     el.b("export").then(el.a("test", fl.a($$1, mn.bm)).executes($$0x -> a((ek)$$0x.getSource(), fl.a($$0x, "test", mn.bm))))
                  ))
                  .then(el.b("exportclosest").executes($$0x -> c(tv.a().a($$0x)))))
               .then(el.b("exportthese").executes($$0x -> c(tv.a().b($$0x)))))
            .then(el.b("exportthat").executes($$0x -> c(tv.a().c($$0x))));
      }

      $$0.register($$3);
   }

   public static CompletableFuture<Suggestions> a(CommandContext<ek> $$0, SuggestionsBuilder $$1) {
      Stream<String> $$2 = ((ek)$$0.getSource()).u().f(mn.aC).c().map(jl::g);
      return eq.b($$2, $$1);
   }

   private static int a(ek $$0, sz $$1) {
      ecu $$2 = $$1.f();
      $$2.a($$0::a);
      return 1;
   }

   private static Stream<sz> a(ek $$0, tp $$1, ty $$2) {
      return $$2.findTestPos().map($$2x -> a($$2x, $$0, $$1)).flatMap(Optional::stream);
   }

   private static Stream<sz> a(ek $$0, tp $$1, tx $$2, int $$3) {
      return $$2.findTests().filter($$1x -> a($$0, ((ta)$$1x.a()).e())).map($$3x -> new sz($$3x, tr.a($$3), $$0.e(), $$1));
   }

   private static Optional<sz> a(jb $$0, ek $$1, tp $$2) {
      aub $$3 = $$1.e();
      if ($$3.c_($$0) instanceof ecu $$4) {
         Optional<jl.c<ta>> $$6 = $$4.j().flatMap($$1.u().f(mn.bm)::a);
         if ($$6.isEmpty()) {
            $$1.b(xo.a("commands.test.error.non_existant_test", $$4.k()));
            return Optional.empty();
         } else {
            jl.c<ta> $$7 = $$6.get();
            sz $$8 = new sz($$7, $$4.w(), $$3, $$2);
            $$8.a($$0);
            return !a($$1, $$8.t()) ? Optional.empty() : Optional.of($$8);
         }
      } else {
         $$1.b(xo.a("commands.test.error.test_instance_not_found.position", $$0.u(), $$0.v(), $$0.w()));
         return Optional.empty();
      }
   }

   private static int a(ek $$0, ame $$1, int $$2, int $$3, int $$4) throws CommandSyntaxException {
      if ($$2 <= 48 && $$3 <= 48 && $$4 <= 48) {
         aub $$5 = $$0.e();
         jb $$6 = a($$0);
         ecu $$7 = tr.a($$1, $$6, new kg($$2, $$3, $$4), dwu.a, $$5);
         jb $$8 = $$7.B();
         jb $$9 = $$8.b($$2 - 1, 0, $$4 - 1);
         jb.d($$8, $$9).forEach($$1x -> $$5.c($$1x, dqb.I.m()));
         $$0.a(() -> xo.a("commands.test.create.success", $$7.k()), true);
         return 1;
      } else {
         throw r.create(48);
      }
   }

   private static int a(ek $$0, String $$1) throws CommandSyntaxException {
      fio $$2 = (fio)$$0.h().a(10.0, 1.0F, false);
      jb $$3 = $$2.b();
      aub $$4 = $$0.e();
      Optional<jb> $$5 = tr.a($$3, 15, $$4);
      if ($$5.isEmpty()) {
         $$5 = tr.a($$3, 200, $$4);
      }

      if ($$5.isEmpty()) {
         throw q.create($$3.u(), $$3.v(), $$3.w());
      } else if ($$4.c_($$5.get()) instanceof ecu $$6) {
         jb var12 = $$6.B();
         jb $$9 = $$3.b(var12);
         String $$10 = $$9.u() + ", " + $$9.v() + ", " + $$9.w();
         String $$11 = $$6.k().getString();
         yc $$12 = xo.a("commands.test.coordinates", $$9.u(), $$9.v(), $$9.w())
            .b(yl.a.a(true).a(o.k).a(new xu.e(xo.c("commands.test.coordinates.copy"))).a(new xm.c("final BlockPos " + $$1 + " = new BlockPos(" + $$10 + ");")));
         $$0.a(() -> xo.a("commands.test.relative_position", $$11, $$12), false);
         ahj.a($$4, new jb($$3), $$10, -2147418368, 10000);
         return 1;
      } else {
         throw n.create();
      }
   }

   private static int a() {
      th.a.a();
      return 1;
   }

   public static int a(ek $$0, te $$1) {
      $$1.a(new ts.a($$0));
      tn $$2 = new tn($$1.a());
      $$2.a(new ts.b($$0, $$2));
      $$2.a($$0x -> so.a($$0x.w()));
      $$1.b();
      return 1;
   }

   private static int a(ek $$0, jl<ta> $$1) {
      return !ecu.a($$0.e(), $$1.a().e(), $$0::a) ? 0 : 1;
   }

   private static boolean a(ek $$0, ame $$1) {
      if ($$0.e().s().b($$1).isEmpty()) {
         $$0.b(xo.a("commands.test.error.structure_not_found", xo.a($$1)));
         return false;
      } else {
         return true;
      }
   }

   private static jb a(ek $$0) {
      jb $$1 = jb.a((jv)$$0.d());
      int $$2 = $$0.e().a(eka.a.b, $$1).v();
      return new jb($$1.u(), $$2, $$1.w() + 3);
   }

   record a(ek a) implements su {
      @Override
      public void a(ss $$0) {
         this.a.a(() -> xo.a("commands.test.batch.starting", $$0.c().g(), $$0.a()), true);
      }

      @Override
      public void b(ss $$0) {
      }
   }

   public record b(ek a, tn b) implements tc {
      @Override
      public void a(sz $$0) {
      }

      @Override
      public void a(sz $$0, te $$1) {
         this.c();
      }

      @Override
      public void b(sz $$0, te $$1) {
         this.c();
      }

      @Override
      public void a(sz $$0, sz $$1, te $$2) {
         this.b.a($$1);
      }

      private void c() {
         if (this.b.i()) {
            this.a.a(() -> xo.a("commands.test.summary", this.b.h()).a(o.p), true);
            if (this.b.d()) {
               this.a.b(xo.a("commands.test.summary.failed", this.b.a()));
            } else {
               this.a.a(() -> xo.c("commands.test.summary.all_required_passed").a(o.k), true);
            }

            if (this.b.e()) {
               this.a.a(xo.a("commands.test.summary.optional_failed", this.b.b()));
            }
         }
      }
   }
}
