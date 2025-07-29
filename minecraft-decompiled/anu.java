import com.google.common.collect.Lists;
import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.ArgumentBuilder;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.Dynamic2CommandExceptionType;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import com.mojang.logging.LogUtils;
import java.util.Deque;
import java.util.List;
import java.util.function.Predicate;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class anu {
   private static final Logger b = LogUtils.getLogger();
   private static final SimpleCommandExceptionType c = new SimpleCommandExceptionType(xo.c("commands.clone.overlap"));
   private static final Dynamic2CommandExceptionType d = new Dynamic2CommandExceptionType(($$0, $$1) -> xo.b("commands.clone.toobig", $$0, $$1));
   private static final SimpleCommandExceptionType e = new SimpleCommandExceptionType(xo.c("commands.clone.failed"));
   public static final Predicate<eef> a = $$0 -> !$$0.a().l();

   public static void a(CommandDispatcher<ek> $$0, eg $$1) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)el.b("clone").requires(el.a(2)))
               .then(a($$1, $$0x -> ((ek)$$0x.getSource()).e())))
            .then(el.b("from").then(el.a("sourceDimension", ew.a()).then(a($$1, $$0x -> ew.a($$0x, "sourceDimension")))))
      );
   }

   private static ArgumentBuilder<ek, ?> a(eg $$0, aos<CommandContext<ek>, aub> $$1) {
      return el.a("begin", gk.a())
         .then(
            ((RequiredArgumentBuilder)el.a("end", gk.a()).then(a($$0, $$1, $$0x -> ((ek)$$0x.getSource()).e())))
               .then(el.b("to").then(el.a("targetDimension", ew.a()).then(a($$0, $$1, $$0x -> ew.a($$0x, "targetDimension")))))
         );
   }

   private static anu.c a(CommandContext<ek> $$0, aub $$1, String $$2) throws CommandSyntaxException {
      jb $$3 = gk.a($$0, $$1, $$2);
      return new anu.c($$1, $$3);
   }

   private static ArgumentBuilder<ek, ?> a(eg $$0, aos<CommandContext<ek>, aub> $$1, aos<CommandContext<ek>, aub> $$2) {
      aos<CommandContext<ek>, anu.c> $$3 = $$1x -> a($$1x, $$1.apply($$1x), "begin");
      aos<CommandContext<ek>, anu.c> $$4 = $$1x -> a($$1x, $$1.apply($$1x), "end");
      aos<CommandContext<ek>, anu.c> $$5 = $$1x -> a($$1x, $$2.apply($$1x), "destination");
      return a($$0, $$3, $$4, $$5, false, el.a("destination", gk.a())).then(a($$0, $$3, $$4, $$5, true, el.b("strict")));
   }

   private static ArgumentBuilder<ek, ?> a(
      eg $$0,
      aos<CommandContext<ek>, anu.c> $$1,
      aos<CommandContext<ek>, anu.c> $$2,
      aos<CommandContext<ek>, anu.c> $$3,
      boolean $$4,
      ArgumentBuilder<ek, ?> $$5
   ) {
      return $$5.executes($$4x -> a((ek)$$4x.getSource(), $$1.apply($$4x), $$2.apply($$4x), $$3.apply($$4x), $$0xx -> true, anu.d.c, $$4))
         .then(a($$1, $$2, $$3, $$0x -> $$0xx -> true, $$4, el.b("replace")))
         .then(a($$1, $$2, $$3, $$0x -> a, $$4, el.b("masked")))
         .then(el.b("filtered").then(a($$1, $$2, $$3, $$0x -> gg.a($$0x, "filter"), $$4, el.a("filter", gg.a($$0)))));
   }

   private static ArgumentBuilder<ek, ?> a(
      aos<CommandContext<ek>, anu.c> $$0,
      aos<CommandContext<ek>, anu.c> $$1,
      aos<CommandContext<ek>, anu.c> $$2,
      aos<CommandContext<ek>, Predicate<eef>> $$3,
      boolean $$4,
      ArgumentBuilder<ek, ?> $$5
   ) {
      return $$5.executes($$5x -> a((ek)$$5x.getSource(), $$0.apply($$5x), $$1.apply($$5x), $$2.apply($$5x), $$3.apply($$5x), anu.d.c, $$4))
         .then(el.b("force").executes($$5x -> a((ek)$$5x.getSource(), $$0.apply($$5x), $$1.apply($$5x), $$2.apply($$5x), $$3.apply($$5x), anu.d.a, $$4)))
         .then(el.b("move").executes($$5x -> a((ek)$$5x.getSource(), $$0.apply($$5x), $$1.apply($$5x), $$2.apply($$5x), $$3.apply($$5x), anu.d.b, $$4)))
         .then(el.b("normal").executes($$5x -> a((ek)$$5x.getSource(), $$0.apply($$5x), $$1.apply($$5x), $$2.apply($$5x), $$3.apply($$5x), anu.d.c, $$4)));
   }

   private static int a(ek $$0, anu.c $$1, anu.c $$2, anu.c $$3, Predicate<eef> $$4, anu.d $$5, boolean $$6) throws CommandSyntaxException {
      jb $$7 = $$1.b();
      jb $$8 = $$2.b();
      euq $$9 = euq.a($$7, $$8);
      jb $$10 = $$3.b();
      jb $$11 = $$10.a($$9.c());
      euq $$12 = euq.a($$10, $$11);
      aub $$13 = $$1.a();
      aub $$14 = $$3.a();
      if (!$$5.a() && $$13 == $$14 && $$12.a($$9)) {
         throw c.create();
      } else {
         int $$15 = $$9.d() * $$9.e() * $$9.f();
         int $$16 = $$0.e().P().d(dmq.B);
         if ($$15 > $$16) {
            throw d.create($$16, $$15);
         } else if (!$$13.a($$7, $$8) || !$$14.a($$10, $$11)) {
            throw gk.a.create();
         } else if ($$14.ak()) {
            throw e.create();
         } else {
            List<anu.b> $$17 = Lists.newArrayList();
            List<anu.b> $$18 = Lists.newArrayList();
            List<anu.b> $$19 = Lists.newArrayList();
            Deque<jb> $$20 = Lists.newLinkedList();
            int $$21 = 0;
            bci.j $$22 = new bci.j(b);

            try {
               jb $$23 = new jb($$12.h() - $$9.h(), $$12.i() - $$9.i(), $$12.j() - $$9.j());

               for (int $$24 = $$9.j(); $$24 <= $$9.m(); $$24++) {
                  for (int $$25 = $$9.i(); $$25 <= $$9.l(); $$25++) {
                     for (int $$26 = $$9.h(); $$26 <= $$9.k(); $$26++) {
                        jb $$27 = new jb($$26, $$25, $$24);
                        jb $$28 = $$27.a((kg)$$23);
                        eef $$29 = new eef($$13, $$27, false);
                        eeb $$30 = $$29.a();
                        if ($$4.test($$29)) {
                           eaz $$31 = $$13.c_($$27);
                           if ($$31 != null) {
                              fcz $$32 = fcz.a($$22.a($$31.t()), $$0.u());
                              $$31.f($$32);
                              anu.a $$33 = new anu.a($$32.b(), $$31.s());
                              $$18.add(new anu.b($$28, $$30, $$33, $$14.a_($$28)));
                              $$20.addLast($$27);
                           } else if (!$$30.s() && !$$30.m($$13, $$27)) {
                              $$19.add(new anu.b($$28, $$30, null, $$14.a_($$28)));
                              $$20.addFirst($$27);
                           } else {
                              $$17.add(new anu.b($$28, $$30, null, $$14.a_($$28)));
                              $$20.addLast($$27);
                           }
                        }
                     }
                  }
               }

               int $$34 = 2 | ($$6 ? 816 : 0);
               if ($$5 == anu.d.b) {
                  for (jb $$35 : $$20) {
                     $$13.a($$35, dqb.iy.m(), $$34 | 816);
                  }

                  int $$36 = $$6 ? $$34 : 3;

                  for (jb $$37 : $$20) {
                     $$13.a($$37, dqb.a.m(), $$36);
                  }
               }

               List<anu.b> $$38 = Lists.newArrayList();
               $$38.addAll($$17);
               $$38.addAll($$18);
               $$38.addAll($$19);
               List<anu.b> $$39 = Lists.reverse($$38);

               for (anu.b $$40 : $$39) {
                  $$14.a($$40.a, dqb.iy.m(), $$34 | 816);
               }

               for (anu.b $$41 : $$38) {
                  if ($$14.a($$41.a, $$41.b, $$34)) {
                     $$21++;
                  }
               }

               for (anu.b $$42 : $$18) {
                  eaz $$43 = $$14.c_($$42.a);
                  if ($$42.c != null && $$43 != null) {
                     $$43.c(fcy.a($$22.a($$43.t()), $$14.K_(), $$42.c.a));
                     $$43.a($$42.c.b);
                     $$43.e();
                  }

                  $$14.a($$42.a, $$42.b, $$34);
               }

               if (!$$6) {
                  for (anu.b $$44 : $$39) {
                     $$14.a($$44.a, $$44.d);
                  }
               }

               $$14.o().a($$13.o(), $$9, $$23);
            } catch (Throwable var35) {
               try {
                  $$22.close();
               } catch (Throwable var34) {
                  var35.addSuppressed(var34);
               }

               throw var35;
            }

            $$22.close();
            if ($$21 == 0) {
               throw e.create();
            } else {
               int $$45 = $$21;
               $$0.a(() -> xo.a("commands.clone.success", $$45), true);
               return $$21;
            }
         }
      }
   }

   record a(ui a, kn b) {
   }

   record b(jb a, eeb b, @Nullable anu.a c, eeb d) {
   }

   record c(aub a, jb b) {
   }

   static enum d {
      a(true),
      b(true),
      c(false);

      private final boolean d;

      private d(final boolean $$0) {
         this.d = $$0;
      }

      public boolean a() {
         return this.d;
      }
   }
}
