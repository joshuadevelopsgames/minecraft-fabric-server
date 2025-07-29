import com.mojang.datafixers.kinds.App;
import com.mojang.datafixers.kinds.Applicative;
import com.mojang.datafixers.kinds.IdF;
import com.mojang.datafixers.kinds.K1;
import com.mojang.datafixers.kinds.OptionalBox;
import com.mojang.datafixers.kinds.OptionalBox.Mu;
import com.mojang.datafixers.util.Function3;
import com.mojang.datafixers.util.Function4;
import com.mojang.datafixers.util.Unit;
import java.util.Optional;
import java.util.function.BiFunction;
import java.util.function.BiPredicate;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import javax.annotation.Nullable;

public class cfq<E extends cam, M> implements App<cfq.c<E>, M> {
   private final cfq.e<E, M> a;

   public static <E extends cam, M> cfq<E, M> a(App<cfq.c<E>, M> $$0) {
      return (cfq<E, M>)$$0;
   }

   public static <E extends cam> cfq.b<E> a() {
      return new cfq.b<>();
   }

   public static <E extends cam> cdo<E> a(Function<cfq.b<E>, ? extends App<cfq.c<E>, cft<E>>> $$0) {
      final cfq.e<E, cft<E>> $$1 = b((App<cfq.c<E>, cft<E>>)$$0.apply(a()));
      return new cdo<E>() {
         @Override
         public boolean trigger(aub $$0, E $$1x, long $$2) {
            cft<E> $$3 = $$1.a($$0, $$1, $$2);
            return $$3 == null ? false : $$3.trigger($$0, $$1, $$2);
         }

         @Override
         public String b() {
            return "OneShot[" + $$1.a() + "]";
         }

         @Override
         public String toString() {
            return this.b();
         }
      };
   }

   public static <E extends cam> cdo<E> a(cft<? super E> $$0, cft<? super E> $$1) {
      return a((Function<cfq.b<E>, ? extends App<cfq.c<E>, cft<E>>>)($$2 -> $$2.group($$2.a($$0)).apply($$2, $$1xx -> $$1::trigger)));
   }

   public static <E extends cam> cdo<E> a(Predicate<E> $$0, cdo<? super E> $$1) {
      return a(a($$0), $$1);
   }

   public static <E extends cam> cdo<E> a(Predicate<E> $$0) {
      return a((Function<cfq.b<E>, ? extends App<cfq.c<E>, cft<E>>>)($$1 -> $$1.a((cft<E>)(($$1x, $$2, $$3) -> $$0.test($$2)))));
   }

   public static <E extends cam> cdo<E> a(BiPredicate<aub, E> $$0) {
      return a((Function<cfq.b<E>, ? extends App<cfq.c<E>, cft<E>>>)($$1 -> $$1.a((cft<E>)(($$1x, $$2, $$3) -> $$0.test($$1x, $$2)))));
   }

   static <E extends cam, M> cfq.e<E, M> b(App<cfq.c<E>, M> $$0) {
      return a($$0).a;
   }

   cfq(cfq.e<E, M> $$0) {
      this.a = $$0;
   }

   static <E extends cam, M> cfq<E, M> a(cfq.e<E, M> $$0) {
      return new cfq<>($$0);
   }

   static final class a<E extends cam, A> extends cfq<E, A> {
      a(A $$0) {
         this($$0, () -> "C[" + $$0 + "]");
      }

      a(final A $$0, final Supplier<String> $$1) {
         super(new cfq.e<E, A>() {
            @Override
            public A a(aub $$0x, E $$1x, long $$2) {
               return $$0;
            }

            @Override
            public String a() {
               return $$1.get();
            }

            @Override
            public String toString() {
               return this.a();
            }
         });
      }
   }

   public static final class b<E extends cam> implements Applicative<cfq.c<E>, cfq.b.a<E>> {
      public <Value> Optional<Value> a(cfr<Mu, Value> $$0) {
         return OptionalBox.unbox($$0.a());
      }

      public <Value> Value b(cfr<com.mojang.datafixers.kinds.IdF.Mu, Value> $$0) {
         return (Value)IdF.get($$0.a());
      }

      public <Value> cfq<E, cfr<Mu, Value>> a(cjo<Value> $$0) {
         return new cfq.d<>(new cfs.c<>($$0));
      }

      public <Value> cfq<E, cfr<com.mojang.datafixers.kinds.IdF.Mu, Value>> b(cjo<Value> $$0) {
         return new cfq.d<>(new cfs.b<>($$0));
      }

      public <Value> cfq<E, cfr<com.mojang.datafixers.kinds.Const.Mu<Unit>, Value>> c(cjo<Value> $$0) {
         return new cfq.d<>(new cfs.a<>($$0));
      }

      public cfq<E, Unit> a(cft<? super E> $$0) {
         return new cfq.f<>($$0);
      }

      public <A> cfq<E, A> a(A $$0) {
         return new cfq.a<>($$0);
      }

      public <A> cfq<E, A> a(Supplier<String> $$0, A $$1) {
         return new cfq.a<>($$1, $$0);
      }

      public <A, R> Function<App<cfq.c<E>, A>, App<cfq.c<E>, R>> lift1(App<cfq.c<E>, Function<A, R>> $$0) {
         return $$1 -> {
            final cfq.e<E, A> $$2 = (cfq.e<E, A>)cfq.b((App<cfq.c<E>, M>)$$1);
            final cfq.e<E, Function<A, R>> $$3 = cfq.b($$0);
            return cfq.a(new cfq.e<E, R>() {
               @Override
               public R a(aub $$0, E $$1x, long $$2x) {
                  A $$3x = (A)$$2.a($$0, $$1x, $$2);
                  if ($$3x == null) {
                     return null;
                  } else {
                     Function<A, R> $$4 = (Function<A, R>)$$3.a($$0, $$1x, $$2);
                     return (R)($$4 == null ? null : $$4.apply($$3x));
                  }
               }

               @Override
               public String a() {
                  return $$3.a() + " * " + $$2.a();
               }

               @Override
               public String toString() {
                  return this.a();
               }
            });
         };
      }

      public <T, R> cfq<E, R> a(final Function<? super T, ? extends R> $$0, App<cfq.c<E>, T> $$1) {
         final cfq.e<E, T> $$2 = (cfq.e<E, T>)cfq.b((App<cfq.c<E>, M>)$$1);
         return cfq.a(new cfq.e<E, R>() {
            @Override
            public R a(aub $$0x, E $$1x, long $$2x) {
               T $$3 = $$2.a($$0, $$1x, $$2);
               return (R)($$3 == null ? null : $$0.apply($$3));
            }

            @Override
            public String a() {
               return $$2.a() + ".map[" + $$0 + "]";
            }

            @Override
            public String toString() {
               return this.a();
            }
         });
      }

      public <A, B, R> cfq<E, R> a(App<cfq.c<E>, BiFunction<A, B, R>> $$0, App<cfq.c<E>, A> $$1, App<cfq.c<E>, B> $$2) {
         final cfq.e<E, A> $$3 = (cfq.e<E, A>)cfq.b((App<cfq.c<E>, M>)$$1);
         final cfq.e<E, B> $$4 = (cfq.e<E, B>)cfq.b((App<cfq.c<E>, M>)$$2);
         final cfq.e<E, BiFunction<A, B, R>> $$5 = cfq.b($$0);
         return cfq.a(new cfq.e<E, R>() {
            @Override
            public R a(aub $$0, E $$1x, long $$2x) {
               A $$3x = $$3.a($$0, $$1x, $$2x);
               if ($$3x == null) {
                  return null;
               } else {
                  B $$4x = $$4.a($$0, $$1x, $$2x);
                  if ($$4x == null) {
                     return null;
                  } else {
                     BiFunction<A, B, R> $$5x = $$5.a($$0, $$1x, $$2x);
                     return $$5x == null ? null : $$5x.apply($$3x, $$4x);
                  }
               }
            }

            @Override
            public String a() {
               return $$5.a() + " * " + $$3.a() + " * " + $$4.a();
            }

            @Override
            public String toString() {
               return this.a();
            }
         });
      }

      public <T1, T2, T3, R> cfq<E, R> a(App<cfq.c<E>, Function3<T1, T2, T3, R>> $$0, App<cfq.c<E>, T1> $$1, App<cfq.c<E>, T2> $$2, App<cfq.c<E>, T3> $$3) {
         final cfq.e<E, T1> $$4 = (cfq.e<E, T1>)cfq.b((App<cfq.c<E>, M>)$$1);
         final cfq.e<E, T2> $$5 = (cfq.e<E, T2>)cfq.b((App<cfq.c<E>, M>)$$2);
         final cfq.e<E, T3> $$6 = (cfq.e<E, T3>)cfq.b((App<cfq.c<E>, M>)$$3);
         final cfq.e<E, Function3<T1, T2, T3, R>> $$7 = cfq.b($$0);
         return cfq.a(new cfq.e<E, R>() {
            @Override
            public R a(aub $$0, E $$1x, long $$2x) {
               T1 $$3x = $$4.a($$0, $$1x, $$2x);
               if ($$3x == null) {
                  return null;
               } else {
                  T2 $$4x = $$5.a($$0, $$1x, $$2x);
                  if ($$4x == null) {
                     return null;
                  } else {
                     T3 $$5x = $$6.a($$0, $$1x, $$2x);
                     if ($$5x == null) {
                        return null;
                     } else {
                        Function3<T1, T2, T3, R> $$6x = $$7.a($$0, $$1x, $$2x);
                        return (R)($$6x == null ? null : $$6x.apply($$3x, $$4x, $$5x));
                     }
                  }
               }
            }

            @Override
            public String a() {
               return $$7.a() + " * " + $$4.a() + " * " + $$5.a() + " * " + $$6.a();
            }

            @Override
            public String toString() {
               return this.a();
            }
         });
      }

      public <T1, T2, T3, T4, R> cfq<E, R> a(
         App<cfq.c<E>, Function4<T1, T2, T3, T4, R>> $$0, App<cfq.c<E>, T1> $$1, App<cfq.c<E>, T2> $$2, App<cfq.c<E>, T3> $$3, App<cfq.c<E>, T4> $$4
      ) {
         final cfq.e<E, T1> $$5 = (cfq.e<E, T1>)cfq.b((App<cfq.c<E>, M>)$$1);
         final cfq.e<E, T2> $$6 = (cfq.e<E, T2>)cfq.b((App<cfq.c<E>, M>)$$2);
         final cfq.e<E, T3> $$7 = (cfq.e<E, T3>)cfq.b((App<cfq.c<E>, M>)$$3);
         final cfq.e<E, T4> $$8 = (cfq.e<E, T4>)cfq.b((App<cfq.c<E>, M>)$$4);
         final cfq.e<E, Function4<T1, T2, T3, T4, R>> $$9 = cfq.b($$0);
         return cfq.a(new cfq.e<E, R>() {
            @Override
            public R a(aub $$0, E $$1x, long $$2x) {
               T1 $$3x = $$5.a($$0, $$1x, $$2x);
               if ($$3x == null) {
                  return null;
               } else {
                  T2 $$4x = $$6.a($$0, $$1x, $$2x);
                  if ($$4x == null) {
                     return null;
                  } else {
                     T3 $$5x = $$7.a($$0, $$1x, $$2x);
                     if ($$5x == null) {
                        return null;
                     } else {
                        T4 $$6x = $$8.a($$0, $$1x, $$2x);
                        if ($$6x == null) {
                           return null;
                        } else {
                           Function4<T1, T2, T3, T4, R> $$7x = $$9.a($$0, $$1x, $$2x);
                           return (R)($$7x == null ? null : $$7x.apply($$3x, $$4x, $$5x, $$6x));
                        }
                     }
                  }
               }
            }

            @Override
            public String a() {
               return $$9.a() + " * " + $$5.a() + " * " + $$6.a() + " * " + $$7.a() + " * " + $$8.a();
            }

            @Override
            public String toString() {
               return this.a();
            }
         });
      }

      static final class a<E extends cam> implements com.mojang.datafixers.kinds.Applicative.Mu {
         private a() {
         }
      }
   }

   public static final class c<E extends cam> implements K1 {
   }

   static final class d<E extends cam, F extends K1, Value> extends cfq<E, cfr<F, Value>> {
      d(final cfs<F, Value> $$0) {
         super(new cfq.e<E, cfr<F, Value>>() {
            public cfr<F, Value> b(aub $$0x, E $$1, long $$2) {
               cbm<?> $$3 = $$1.eh();
               Optional<Value> $$4 = $$3.d($$0.a());
               return $$4 == null ? null : $$0.a($$3, $$4);
            }

            @Override
            public String a() {
               return "M[" + $$0 + "]";
            }

            @Override
            public String toString() {
               return this.a();
            }
         });
      }
   }

   interface e<E extends cam, R> {
      @Nullable
      R a(aub var1, E var2, long var3);

      String a();
   }

   static final class f<E extends cam> extends cfq<E, Unit> {
      f(final cft<? super E> $$0) {
         super(new cfq.e<E, Unit>() {
            @Nullable
            public Unit b(aub $$0x, E $$1, long $$2) {
               return $$0.trigger($$0, $$1, $$2) ? Unit.INSTANCE : null;
            }

            @Override
            public String a() {
               return "T[" + $$0 + "]";
            }
         });
      }
   }
}
