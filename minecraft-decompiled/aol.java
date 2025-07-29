import com.google.common.collect.Lists;
import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.ArgumentBuilder;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.Dynamic2CommandExceptionType;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import java.util.Collections;
import java.util.List;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class aol {
   private static final Dynamic2CommandExceptionType a = new Dynamic2CommandExceptionType(($$0, $$1) -> xo.b("commands.fill.toobig", $$0, $$1));
   static final gf b = new gf(dqb.a.m(), Collections.emptySet(), null);
   private static final SimpleCommandExceptionType c = new SimpleCommandExceptionType(xo.c("commands.fill.failed"));

   public static void a(CommandDispatcher<ek> $$0, eg $$1) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)el.b("fill").requires(el.a(2)))
            .then(
               el.a("from", gk.a())
                  .then(
                     el.a("to", gk.a())
                        .then(
                           a($$1, el.a("block", gh.a($$1)), $$0x -> gk.a($$0x, "from"), $$0x -> gk.a($$0x, "to"), $$0x -> gh.a($$0x, "block"), $$0x -> null)
                              .then(
                                 ((LiteralArgumentBuilder)el.b("replace")
                                       .executes(
                                          $$0x -> a(
                                             (ek)$$0x.getSource(), euq.a(gk.a($$0x, "from"), gk.a($$0x, "to")), gh.a($$0x, "block"), aol.d.a, null, false
                                          )
                                       ))
                                    .then(
                                       a(
                                          $$1,
                                          el.a("filter", gg.a($$1)),
                                          $$0x -> gk.a($$0x, "from"),
                                          $$0x -> gk.a($$0x, "to"),
                                          $$0x -> gh.a($$0x, "block"),
                                          $$0x -> gg.a($$0x, "filter")
                                       )
                                    )
                              )
                              .then(
                                 el.b("keep")
                                    .executes(
                                       $$0x -> a(
                                          (ek)$$0x.getSource(),
                                          euq.a(gk.a($$0x, "from"), gk.a($$0x, "to")),
                                          gh.a($$0x, "block"),
                                          aol.d.a,
                                          $$0xx -> $$0xx.c().w($$0xx.d()),
                                          false
                                       )
                                    )
                              )
                        )
                  )
            )
      );
   }

   private static ArgumentBuilder<ek, ?> a(
      eg $$0,
      ArgumentBuilder<ek, ?> $$1,
      aos<CommandContext<ek>, jb> $$2,
      aos<CommandContext<ek>, jb> $$3,
      aos<CommandContext<ek>, gf> $$4,
      aol.e<CommandContext<ek>, Predicate<eef>> $$5
   ) {
      return $$1.executes($$4x -> a((ek)$$4x.getSource(), euq.a($$2.apply($$4x), $$3.apply($$4x)), $$4.apply($$4x), aol.d.a, $$5.apply($$4x), false))
         .then(
            el.b("outline")
               .executes($$4x -> a((ek)$$4x.getSource(), euq.a($$2.apply($$4x), $$3.apply($$4x)), $$4.apply($$4x), aol.d.b, $$5.apply($$4x), false))
         )
         .then(
            el.b("hollow").executes($$4x -> a((ek)$$4x.getSource(), euq.a($$2.apply($$4x), $$3.apply($$4x)), $$4.apply($$4x), aol.d.c, $$5.apply($$4x), false))
         )
         .then(
            el.b("destroy")
               .executes($$4x -> a((ek)$$4x.getSource(), euq.a($$2.apply($$4x), $$3.apply($$4x)), $$4.apply($$4x), aol.d.d, $$5.apply($$4x), false))
         )
         .then(
            el.b("strict").executes($$4x -> a((ek)$$4x.getSource(), euq.a($$2.apply($$4x), $$3.apply($$4x)), $$4.apply($$4x), aol.d.a, $$5.apply($$4x), true))
         );
   }

   private static int a(ek $$0, euq $$1, gf $$2, aol.d $$3, @Nullable Predicate<eef> $$4, boolean $$5) throws CommandSyntaxException {
      int $$6 = $$1.d() * $$1.e() * $$1.f();
      int $$7 = $$0.e().P().d(dmq.B);
      if ($$6 > $$7) {
         throw a.create($$7, $$6);
      } else {
         record a(jb a, eeb b) {
         }

         List<a> $$8 = Lists.newArrayList();
         aub $$9 = $$0.e();
         if ($$9.ak()) {
            throw c.create();
         } else {
            int $$10 = 0;

            for (jb $$11 : jb.b($$1.h(), $$1.i(), $$1.j(), $$1.k(), $$1.l(), $$1.m())) {
               if ($$4 == null || $$4.test(new eef($$9, $$11, true))) {
                  eeb $$12 = $$9.a_($$11);
                  boolean $$13 = false;
                  if ($$3.f.affect($$9, $$11)) {
                     $$13 = true;
                  }

                  gf $$14 = $$3.e.filter($$1, $$11, $$2, $$9);
                  if ($$14 == null) {
                     if ($$13) {
                        $$10++;
                     }
                  } else if (!$$14.a($$9, $$11, 2 | ($$5 ? 816 : 256))) {
                     if ($$13) {
                        $$10++;
                     }
                  } else {
                     if (!$$5) {
                        $$8.add(new a($$11.j(), $$12));
                     }

                     $$10++;
                  }
               }
            }

            for (a $$15 : $$8) {
               $$9.a($$15.a, $$15.b);
            }

            if ($$10 == 0) {
               throw c.create();
            } else {
               int $$16 = $$10;
               $$0.a(() -> xo.a("commands.fill.success", $$16), true);
               return $$10;
            }
         }
      }
   }

   @FunctionalInterface
   public interface b {
      aol.b a = ($$0, $$1) -> false;

      boolean affect(aub var1, jb var2);
   }

   @FunctionalInterface
   public interface c {
      aol.c a = ($$0, $$1, $$2, $$3) -> $$2;

      @Nullable
      gf filter(euq var1, jb var2, gf var3, aub var4);
   }

   static enum d {
      a(aol.b.a, aol.c.a),
      b(
         aol.b.a,
         ($$0, $$1, $$2, $$3) -> $$1.u() != $$0.h()
               && $$1.u() != $$0.k()
               && $$1.v() != $$0.i()
               && $$1.v() != $$0.l()
               && $$1.w() != $$0.j()
               && $$1.w() != $$0.m()
            ? null
            : $$2
      ),
      c(
         aol.b.a,
         ($$0, $$1, $$2, $$3) -> $$1.u() != $$0.h()
               && $$1.u() != $$0.k()
               && $$1.v() != $$0.i()
               && $$1.v() != $$0.l()
               && $$1.w() != $$0.j()
               && $$1.w() != $$0.m()
            ? aol.b
            : $$2
      ),
      d(($$0, $$1) -> $$0.b($$1, true), aol.c.a);

      public final aol.c e;
      public final aol.b f;

      private d(final aol.b $$0, final aol.c $$1) {
         this.f = $$0;
         this.e = $$1;
      }
   }

   @FunctionalInterface
   interface e<T, R> {
      @Nullable
      R apply(T var1) throws CommandSyntaxException;
   }
}
