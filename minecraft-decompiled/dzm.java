import com.mojang.serialization.MapCodec;
import java.util.Map;
import java.util.Map.Entry;
import java.util.function.Function;
import javax.annotation.Nullable;

public class dzm extends dpz {
   public static final MapCodec<dzm> a = b(dzm::new);
   public static final ees b = dvu.f;
   public static final ees c = dvu.b;
   public static final ees d = dvu.c;
   public static final ees e = dvu.d;
   public static final ees f = dvu.e;
   public static final Map<jh, ees> g = dvu.h.entrySet().stream().filter($$0 -> $$0.getKey() != jh.a).collect(ag.a());
   private final Function<eeb, fjm> h;

   @Override
   public MapCodec<dzm> a() {
      return a;
   }

   public dzm(eea.d $$0) {
      super($$0);
      this.l(this.C.b().b(b, false).b(c, false).b(d, false).b(e, false).b(f, false));
      this.h = this.b();
   }

   private Function<eeb, fjm> b() {
      Map<jh, fjm> $$0 = fjj.d(dpz.c(16.0, 0.0, 1.0));
      return this.a($$1 -> {
         fjm $$2 = fjj.a();

         for (Entry<jh, ees> $$3 : g.entrySet()) {
            if ($$1.c($$3.getValue())) {
               $$2 = fjj.a($$2, $$0.get($$3.getKey()));
            }
         }

         return $$2.c() ? fjj.b() : $$2;
      });
   }

   @Override
   protected fjm a(eeb $$0, dly $$1, jb $$2, fix $$3) {
      return this.h.apply($$0);
   }

   @Override
   protected boolean e_(eeb $$0) {
      return true;
   }

   @Override
   protected boolean a(eeb $$0, dmx $$1, jb $$2) {
      return this.o(this.e($$0, $$1, $$2));
   }

   private boolean o(eeb $$0) {
      return this.q($$0) > 0;
   }

   private int q(eeb $$0) {
      int $$1 = 0;

      for (ees $$2 : g.values()) {
         if ($$0.c($$2)) {
            $$1++;
         }
      }

      return $$1;
   }

   private boolean b(dly $$0, jb $$1, jh $$2) {
      if ($$2 == jh.a) {
         return false;
      } else {
         jb $$3 = $$1.a($$2);
         if (a($$0, $$3, $$2)) {
            return true;
         } else if ($$2.o() == jh.a.b) {
            return false;
         } else {
            ees $$4 = g.get($$2);
            eeb $$5 = $$0.a_($$1.d());
            return $$5.a(this) && $$5.c($$4);
         }
      }
   }

   public static boolean a(dly $$0, jb $$1, jh $$2) {
      return dvg.a($$0, $$2, $$1, $$0.a_($$1));
   }

   private eeb e(eeb $$0, dly $$1, jb $$2) {
      jb $$3 = $$2.d();
      if ($$0.c(b)) {
         $$0 = $$0.b(b, a($$1, $$3, jh.a));
      }

      eeb $$4 = null;

      for (jh $$5 : jh.c.a) {
         ees $$6 = a($$5);
         if ($$0.c($$6)) {
            boolean $$7 = this.b($$1, $$2, $$5);
            if (!$$7) {
               if ($$4 == null) {
                  $$4 = $$1.a_($$3);
               }

               $$7 = $$4.a(this) && $$4.c($$6);
            }

            $$0 = $$0.b($$6, $$7);
         }
      }

      return $$0;
   }

   @Override
   protected eeb a(eeb $$0, dmx $$1, dnj $$2, jb $$3, jh $$4, jb $$5, eeb $$6, bck $$7) {
      if ($$4 == jh.a) {
         return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
      } else {
         eeb $$8 = this.e($$0, $$1, $$3);
         return !this.o($$8) ? dqb.a.m() : $$8;
      }
   }

   @Override
   protected void b(eeb $$0, aub $$1, jb $$2, bck $$3) {
      if ($$1.P().c(dmq.Z)) {
         if ($$3.a(4) == 0) {
            jh $$4 = jh.b($$3);
            jb $$5 = $$2.d();
            if ($$4.o().d() && !$$0.c(a($$4))) {
               if (this.a($$1, $$2)) {
                  jb $$6 = $$2.a($$4);
                  eeb $$7 = $$1.a_($$6);
                  if ($$7.l()) {
                     jh $$8 = $$4.h();
                     jh $$9 = $$4.i();
                     boolean $$10 = $$0.c(a($$8));
                     boolean $$11 = $$0.c(a($$9));
                     jb $$12 = $$6.a($$8);
                     jb $$13 = $$6.a($$9);
                     if ($$10 && a($$1, $$12, $$8)) {
                        $$1.a($$6, this.m().b(a($$8), true), 2);
                     } else if ($$11 && a($$1, $$13, $$9)) {
                        $$1.a($$6, this.m().b(a($$9), true), 2);
                     } else {
                        jh $$14 = $$4.g();
                        if ($$10 && $$1.w($$12) && a($$1, $$2.a($$8), $$14)) {
                           $$1.a($$12, this.m().b(a($$14), true), 2);
                        } else if ($$11 && $$1.w($$13) && a($$1, $$2.a($$9), $$14)) {
                           $$1.a($$13, this.m().b(a($$14), true), 2);
                        } else if ($$3.i() < 0.05 && a($$1, $$6.d(), jh.b)) {
                           $$1.a($$6, this.m().b(b, true), 2);
                        }
                     }
                  } else if (a($$1, $$6, $$4)) {
                     $$1.a($$2, $$0.b(a($$4), true), 2);
                  }
               }
            } else {
               if ($$4 == jh.b && $$2.v() < $$1.ao()) {
                  if (this.b($$1, $$2, $$4)) {
                     $$1.a($$2, $$0.b(b, true), 2);
                     return;
                  }

                  if ($$1.w($$5)) {
                     if (!this.a($$1, $$2)) {
                        return;
                     }

                     eeb $$15 = $$0;

                     for (jh $$16 : jh.c.a) {
                        if ($$3.h() || !a($$1, $$5.a($$16), $$16)) {
                           $$15 = $$15.b(a($$16), false);
                        }
                     }

                     if (this.r($$15)) {
                        $$1.a($$5, $$15, 2);
                     }

                     return;
                  }
               }

               if ($$2.v() > $$1.L_()) {
                  jb $$17 = $$2.e();
                  eeb $$18 = $$1.a_($$17);
                  if ($$18.l() || $$18.a(this)) {
                     eeb $$19 = $$18.l() ? this.m() : $$18;
                     eeb $$20 = this.a($$0, $$19, $$3);
                     if ($$19 != $$20 && this.r($$20)) {
                        $$1.a($$17, $$20, 2);
                     }
                  }
               }
            }
         }
      }
   }

   private eeb a(eeb $$0, eeb $$1, bck $$2) {
      for (jh $$3 : jh.c.a) {
         if ($$2.h()) {
            ees $$4 = a($$3);
            if ($$0.c($$4)) {
               $$1 = $$1.b($$4, true);
            }
         }
      }

      return $$1;
   }

   private boolean r(eeb $$0) {
      return $$0.c(c) || $$0.c(d) || $$0.c(e) || $$0.c(f);
   }

   private boolean a(dly $$0, jb $$1) {
      int $$2 = 4;
      Iterable<jb> $$3 = jb.b($$1.u() - 4, $$1.v() - 1, $$1.w() - 4, $$1.u() + 4, $$1.v() + 1, $$1.w() + 4);
      int $$4 = 5;

      for (jb $$5 : $$3) {
         if ($$0.a_($$5).a(this)) {
            if (--$$4 <= 0) {
               return false;
            }
         }
      }

      return true;
   }

   @Override
   protected boolean a(eeb $$0, dgo $$1) {
      eeb $$2 = $$1.q().a_($$1.a());
      return $$2.a(this) ? this.q($$2) < g.size() : super.a($$0, $$1);
   }

   @Nullable
   @Override
   public eeb a(dgo $$0) {
      eeb $$1 = $$0.q().a_($$0.a());
      boolean $$2 = $$1.a(this);
      eeb $$3 = $$2 ? $$1 : this.m();

      for (jh $$4 : $$0.f()) {
         if ($$4 != jh.a) {
            ees $$5 = a($$4);
            boolean $$6 = $$2 && $$1.c($$5);
            if (!$$6 && this.b($$0.q(), $$0.a(), $$4)) {
               return $$3.b($$5, true);
            }
         }
      }

      return $$2 ? $$3 : null;
   }

   @Override
   protected void a(eec.a<dpz, eeb> $$0) {
      $$0.a(b, c, d, e, f);
   }

   @Override
   protected eeb a(eeb $$0, dwu $$1) {
      switch ($$1) {
         case c:
            return $$0.b(c, $$0.c(e)).b(d, $$0.c(f)).b(e, $$0.c(c)).b(f, $$0.c(d));
         case d:
            return $$0.b(c, $$0.c(d)).b(d, $$0.c(e)).b(e, $$0.c(f)).b(f, $$0.c(c));
         case b:
            return $$0.b(c, $$0.c(f)).b(d, $$0.c(c)).b(e, $$0.c(d)).b(f, $$0.c(e));
         default:
            return $$0;
      }
   }

   @Override
   protected eeb a(eeb $$0, dvd $$1) {
      switch ($$1) {
         case b:
            return $$0.b(c, $$0.c(e)).b(e, $$0.c(c));
         case c:
            return $$0.b(d, $$0.c(f)).b(f, $$0.c(d));
         default:
            return super.a($$0, $$1);
      }
   }

   public static ees a(jh $$0) {
      return g.get($$0);
   }
}
