import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.exceptions.DynamicCommandExceptionType;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;
import java.util.function.ToIntFunction;
import java.util.stream.Stream;

public class aqe {
   private static final List<amd<dlk>> a = List.of(
      dll.a, dll.b, dll.c, dll.d, dll.e, dll.f, dll.g, dll.h, dll.i, dll.j, dll.k, dll.l, dll.m, dll.n, dll.o, dll.p, dll.q, dll.r
   );
   private static final List<amd<dli>> b = List.of(dlj.a, dlj.b, dlj.c, dlj.d, dlj.e, dlj.f, dlj.g, dlj.h, dlj.i, dlj.j, dlj.k);
   private static final ToIntFunction<amd<dlk>> c = ag.g(a);
   private static final ToIntFunction<amd<dli>> d = ag.g(b);
   private static final DynamicCommandExceptionType e = new DynamicCommandExceptionType($$0 -> xo.b("Invalid pattern", $$0));

   public static void a(CommandDispatcher<ek> $$0) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)el.b("spawn_armor_trims").requires(el.a(2)))
               .then(el.b("*_lag_my_game").executes($$0x -> a((ek)$$0x.getSource(), ((ek)$$0x.getSource()).h()))))
            .then(el.a("pattern", fm.a(mn.bq)).executes($$0x -> a((ek)$$0x.getSource(), ((ek)$$0x.getSource()).h(), fm.a($$0x, "pattern", mn.bq, e))))
      );
   }

   private static int a(ek $$0, cut $$1) {
      return a($$0, $$1, $$0.l().ba().f(mn.bq).c());
   }

   private static int a(ek $$0, cut $$1, amd<dlk> $$2) {
      return a($$0, $$1, Stream.of($$0.l().ba().f(mn.bq).a($$2).orElseThrow()));
   }

   private static int a(ek $$0, cut $$1, Stream<jl.c<dlk>> $$2) {
      aub $$3 = $$0.e();
      List<jl.c<dlk>> $$4 = $$2.sorted(Comparator.comparing($$0x -> c.applyAsInt($$0x.h()))).toList();
      List<jl.c<dli>> $$5 = $$3.K_().f(mn.bp).c().sorted(Comparator.comparing($$0x -> d.applyAsInt($$0x.h()))).toList();
      List<jl.c<dcr>> $$6 = a($$3.K_().f(mn.N));
      jb $$7 = $$1.dx().a($$1.cS(), 5);
      double $$8 = 3.0;

      for (int $$9 = 0; $$9 < $$5.size(); $$9++) {
         jl.c<dli> $$10 = $$5.get($$9);

         for (int $$11 = 0; $$11 < $$4.size(); $$11++) {
            jl.c<dlk> $$12 = $$4.get($$11);
            dlg $$13 = new dlg($$10, $$12);

            for (int $$14 = 0; $$14 < $$6.size(); $$14++) {
               jl.c<dcr> $$15 = $$6.get($$14);
               double $$16 = $$7.u() + 0.5 - $$14 * 3.0;
               double $$17 = $$7.v() + 0.5 + $$9 * 3.0;
               double $$18 = $$7.w() + 0.5 + $$11 * 10;
               cqo $$19 = new cqo($$3, $$16, $$17, $$18);
               $$19.v(180.0F);
               $$19.g(true);
               dcv $$20 = new dcv($$15);
               dle $$21 = Objects.requireNonNull($$20.a(kq.D));
               $$20.b(kq.W, $$13);
               $$19.a($$21.b(), $$20);
               if ($$14 == 0) {
                  $$19.b($$13.b().a().a($$13.a()).f().f(" & ").b($$13.a().a().b()));
                  $$19.p(true);
               } else {
                  $$19.l(true);
               }

               $$3.b($$19);
            }
         }
      }

      $$0.a(() -> xo.b("Armorstands with trimmed armor spawned around you"), true);
      return 1;
   }

   private static List<jl.c<dcr>> a(jn<dcr> $$0) {
      List<jl.c<dcr>> $$1 = new ArrayList<>();
      $$0.c().forEach($$1x -> {
         dle $$2 = ((dcr)$$1x.a()).f().a(kq.D);
         if ($$2 != null && $$2.b().a() == bzw.a.b && $$2.d().isPresent()) {
            $$1.add($$1x);
         }
      });
      return $$1;
   }
}
