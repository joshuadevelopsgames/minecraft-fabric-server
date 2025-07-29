import com.google.common.collect.Lists;
import com.mojang.logging.LogUtils;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;
import org.apache.commons.lang3.mutable.MutableObject;
import org.slf4j.Logger;

public class ewc {
   static final Logger a = LogUtils.getLogger();
   private static final int b = Integer.MIN_VALUE;

   public static Optional<euy.b> a(
      euy.a $$0, jl<ewi> $$1, Optional<ame> $$2, int $$3, jb $$4, boolean $$5, Optional<eka.a> $$6, int $$7, ewm $$8, evy $$9, eyk $$10
   ) {
      jz $$11 = $$0.a();
      efz $$12 = $$0.b();
      ezb $$13 = $$0.e();
      dmw $$14 = $$0.i();
      ekz $$15 = $$0.f();
      jy<ewi> $$16 = $$11.f(mn.bk);
      dwu $$17 = dwu.a($$15);
      ewi $$18 = $$1.e().flatMap($$2x -> $$16.f($$8.lookup($$2x))).orElse($$1.a());
      ewg $$19 = $$18.a($$15);
      if ($$19 == evz.b) {
         return Optional.empty();
      } else {
         jb $$22;
         if ($$2.isPresent()) {
            ame $$20 = $$2.get();
            Optional<jb> $$21 = a($$19, $$20, $$4, $$17, $$13, $$15);
            if ($$21.isEmpty()) {
               a.error("No starting jigsaw {} found in start pool {}", $$20, $$1.e().map($$0x -> $$0x.a().toString()).orElse("<unregistered>"));
               return Optional.empty();
            }

            $$22 = $$21.get();
         } else {
            $$22 = $$4;
         }

         kg $$24 = $$22.b($$4);
         jb $$25 = $$4.b($$24);
         euu $$26 = new euu($$13, $$19, $$25, $$19.h(), $$17, $$19.a($$13, $$25, $$17), $$10);
         euq $$27 = $$26.f();
         int $$28 = ($$27.k() + $$27.h()) / 2;
         int $$29 = ($$27.m() + $$27.j()) / 2;
         int $$30 = $$6.isEmpty() ? $$25.v() : $$4.v() + $$12.b($$28, $$29, $$6.get(), $$14, $$0.d());
         int $$31 = $$27.i() + $$26.d();
         $$26.a(0, $$30 - $$31, 0);
         if (a($$14, $$9, $$26.f())) {
            a.debug("Center piece {} with bounding box {} does not fit dimension padding {}", new Object[]{$$19, $$26.f(), $$9});
            return Optional.empty();
         } else {
            int $$32 = $$30 + $$24.v();
            return Optional.of(
               new euy.b(
                  new jb($$28, $$32, $$29),
                  (Consumer<evq>)($$17x -> {
                     List<euu> $$18x = Lists.newArrayList();
                     $$18x.add($$26);
                     if ($$3 > 0) {
                        fin $$19x = new fin(
                           $$28 - $$7,
                           Math.max($$32 - $$7, $$14.L_() + $$9.b()),
                           $$29 - $$7,
                           $$28 + $$7 + 1,
                           Math.min($$32 + $$7 + 1, $$14.ao() + 1 - $$9.c()),
                           $$29 + $$7 + 1
                        );
                        fjm $$20 = fjj.a(fjj.a($$19x), fjj.a(fin.a($$27)), fiw.e);
                        a($$0.d(), $$3, $$5, $$12, $$13, $$14, $$15, $$16, $$26, $$18x, $$20, $$8, $$10);
                        $$18x.forEach($$17x::a);
                     }
                  })
               )
            );
         }
      }
   }

   private static boolean a(dmw $$0, evy $$1, euq $$2) {
      if ($$1 == evy.b) {
         return false;
      } else {
         int $$3 = $$0.L_() + $$1.b();
         int $$4 = $$0.ao() - $$1.c();
         return $$2.i() < $$3 || $$2.l() > $$4;
      }
   }

   private static Optional<jb> a(ewg $$0, ame $$1, jb $$2, dwu $$3, ezb $$4, ekz $$5) {
      for (eza.a $$7 : $$0.a($$4, $$2, $$3, $$5)) {
         if ($$1.equals($$7.c())) {
            return Optional.of($$7.a().a());
         }
      }

      return Optional.empty();
   }

   private static void a(eko $$0, int $$1, boolean $$2, efz $$3, ezb $$4, dmw $$5, bck $$6, jy<ewi> $$7, euu $$8, List<euu> $$9, fjm $$10, ewm $$11, eyk $$12) {
      ewc.b $$13 = new ewc.b($$7, $$1, $$3, $$4, $$9, $$6);
      $$13.a($$8, new MutableObject($$10), 0, $$2, $$5, $$0, $$11, $$12);

      while ($$13.g.hasNext()) {
         ewc.a $$14 = (ewc.a)$$13.g.next();
         $$13.a($$14.a, $$14.b, $$14.c, $$2, $$5, $$0, $$11, $$12);
      }
   }

   public static boolean a(aub $$0, jl<ewi> $$1, ame $$2, int $$3, jb $$4, boolean $$5) {
      efz $$6 = $$0.n().g();
      ezb $$7 = $$0.s();
      dnq $$8 = $$0.b();
      bck $$9 = $$0.H_();
      euy.a $$10 = new euy.a($$0.K_(), $$6, $$6.d(), $$0.n().i(), $$7, $$0.F(), new dlz($$4), $$0, $$0x -> true);
      Optional<euy.b> $$11 = a($$10, $$1, Optional.of($$2), $$3, $$4, false, Optional.empty(), 128, ewm.a, ewz.d, ewz.e);
      if ($$11.isPresent()) {
         evq $$12 = $$11.get().a();

         for (evc $$13 : $$12.a().c()) {
            if ($$13 instanceof euu $$14) {
               $$14.a($$0, $$8, $$6, $$9, euq.a(), $$4, $$5);
            }
         }

         return true;
      } else {
         return false;
      }
   }

   record a(euu a, MutableObject<fjm> b, int c) {
   }

   static final class b {
      private final jy<ewi> a;
      private final int b;
      private final efz c;
      private final ezb d;
      private final List<? super euu> e;
      private final bck f;
      final bco<ewc.a> g = new bco<>();

      b(jy<ewi> $$0, int $$1, efz $$2, ezb $$3, List<? super euu> $$4, bck $$5) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
         this.d = $$3;
         this.e = $$4;
         this.f = $$5;
      }

      void a(euu $$0, MutableObject<fjm> $$1, int $$2, boolean $$3, dmw $$4, eko $$5, ewm $$6, eyk $$7) {
         ewg $$8 = $$0.b();
         jb $$9 = $$0.c();
         dwu $$10 = $$0.a();
         ewi.a $$11 = $$8.g();
         boolean $$12 = $$11 == ewi.a.b;
         MutableObject<fjm> $$13 = new MutableObject();
         euq $$14 = $$0.f();
         int $$15 = $$14.i();

         label129:
         for (eza.a $$16 : $$8.a(this.d, $$9, $$10, this.f)) {
            eza.d $$17 = $$16.a();
            jh $$18 = duh.o($$17.b());
            jb $$19 = $$17.a();
            jb $$20 = $$19.a($$18);
            int $$21 = $$19.v() - $$15;
            int $$22 = Integer.MIN_VALUE;
            amd<ewi> $$23 = $$6.lookup($$16.d());
            Optional<? extends jl<ewi>> $$24 = this.a.a($$23);
            if ($$24.isEmpty()) {
               ewc.a.warn("Empty or non-existent pool: {}", $$23.a());
            } else {
               jl<ewi> $$25 = (jl<ewi>)$$24.get();
               if ($$25.a().c() == 0 && !$$25.a(qx.a)) {
                  ewc.a.warn("Empty or non-existent pool: {}", $$23.a());
               } else {
                  jl<ewi> $$26 = $$25.a().b();
                  if ($$26.a().c() == 0 && !$$26.a(qx.a)) {
                     ewc.a.warn("Empty or non-existent fallback pool: {}", $$26.e().map($$0x -> $$0x.a().toString()).orElse("<unregistered>"));
                  } else {
                     boolean $$27 = $$14.b($$20);
                     MutableObject<fjm> $$28;
                     if ($$27) {
                        $$28 = $$13;
                        if ($$13.getValue() == null) {
                           $$13.setValue(fjj.a(fin.a($$14)));
                        }
                     } else {
                        $$28 = $$1;
                     }

                     List<ewg> $$30 = Lists.newArrayList();
                     if ($$2 != this.b) {
                        $$30.addAll($$25.a().b(this.f));
                     }

                     $$30.addAll($$26.a().b(this.f));
                     int $$31 = $$16.f();

                     for (ewg $$32 : $$30) {
                        if ($$32 == evz.b) {
                           break;
                        }

                        for (dwu $$33 : dwu.b(this.f)) {
                           List<eza.a> $$34 = $$32.a(this.d, jb.c, $$33, this.f);
                           euq $$35 = $$32.a(this.d, jb.c, $$33);
                           int $$37;
                           if ($$3 && $$35.e() <= 16) {
                              $$37 = $$34.stream().mapToInt($$2x -> {
                                 eza.d $$3x = $$2x.a();
                                 if (!$$35.b($$3x.a().a(duh.o($$3x.b())))) {
                                    return 0;
                                 } else {
                                    amd<ewi> $$4x = $$6.lookup($$2x.d());
                                    Optional<? extends jl<ewi>> $$5x = this.a.a($$4x);
                                    Optional<jl<ewi>> $$6x = $$5x.map($$0xx -> ((ewi)$$0xx.a()).b());
                                    int $$7x = $$5x.<Integer>map($$0xx -> ((ewi)$$0xx.a()).a(this.d)).orElse(0);
                                    int $$8x = $$6x.<Integer>map($$0xx -> ((ewi)$$0xx.a()).a(this.d)).orElse(0);
                                    return Math.max($$7x, $$8x);
                                 }
                              }).max().orElse(0);
                           } else {
                              $$37 = 0;
                           }

                           for (eza.a $$38 : $$34) {
                              if (duh.a($$16, $$38)) {
                                 jb $$39 = $$38.a().a();
                                 jb $$40 = $$20.b($$39);
                                 euq $$41 = $$32.a(this.d, $$40, $$33);
                                 int $$42 = $$41.i();
                                 ewi.a $$43 = $$32.g();
                                 boolean $$44 = $$43 == ewi.a.b;
                                 int $$45 = $$39.v();
                                 int $$46 = $$21 - $$45 + duh.o($$17.b()).k();
                                 int $$47;
                                 if ($$12 && $$44) {
                                    $$47 = $$15 + $$46;
                                 } else {
                                    if ($$22 == Integer.MIN_VALUE) {
                                       $$22 = this.c.b($$19.u(), $$19.w(), eka.a.a, $$4, $$5);
                                    }

                                    $$47 = $$22 - $$45;
                                 }

                                 int $$49 = $$47 - $$42;
                                 euq $$50 = $$41.b(0, $$49, 0);
                                 jb $$51 = $$40.b(0, $$49, 0);
                                 if ($$37 > 0) {
                                    int $$52 = Math.max($$37 + 1, $$50.l() - $$50.i());
                                    $$50.a(new jb($$50.h(), $$50.i() + $$52, $$50.j()));
                                 }

                                 if (!fjj.c((fjm)$$28.getValue(), fjj.a(fin.a($$50).h(0.25)), fiw.c)) {
                                    $$28.setValue(fjj.b((fjm)$$28.getValue(), fjj.a(fin.a($$50)), fiw.e));
                                    int $$53 = $$0.d();
                                    int $$54;
                                    if ($$44) {
                                       $$54 = $$53 - $$46;
                                    } else {
                                       $$54 = $$32.h();
                                    }

                                    euu $$56 = new euu(this.d, $$32, $$51, $$54, $$33, $$50, $$7);
                                    int $$57;
                                    if ($$12) {
                                       $$57 = $$15 + $$21;
                                    } else if ($$44) {
                                       $$57 = $$47 + $$45;
                                    } else {
                                       if ($$22 == Integer.MIN_VALUE) {
                                          $$22 = this.c.b($$19.u(), $$19.w(), eka.a.a, $$4, $$5);
                                       }

                                       $$57 = $$22 + $$46 / 2;
                                    }

                                    $$0.a(new ewb($$20.u(), $$57 - $$21 + $$53, $$20.w(), $$46, $$43));
                                    $$56.a(new ewb($$19.u(), $$57 - $$45 + $$54, $$19.w(), -$$46, $$11));
                                    this.e.add($$56);
                                    if ($$2 + 1 <= this.b) {
                                       ewc.a $$60 = new ewc.a($$56, $$28, $$2 + 1);
                                       this.g.a($$60, $$31);
                                    }
                                    continue label129;
                                 }
                              }
                           }
                        }
                     }
                  }
               }
            }
         }
      }
   }
}
