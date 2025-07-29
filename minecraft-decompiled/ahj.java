import com.google.common.collect.Lists;
import com.mojang.logging.LogUtils;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.UUID;
import java.util.Map.Entry;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class ahj {
   private static final Logger a = LogUtils.getLogger();

   public static void a(aub $$0, jb $$1, String $$2, int $$3, int $$4) {
      a($$0, (abe)(new abi($$1, $$3, $$2, $$4)));
   }

   public static void a(aub $$0) {
      a($$0, (abe)(new abj()));
   }

   public static void a(aub $$0, dlz $$1) {
   }

   public static void a(aub $$0, jb $$1) {
      d($$0, $$1);
   }

   public static void b(aub $$0, jb $$1) {
      d($$0, $$1);
   }

   public static void c(aub $$0, jb $$1) {
      d($$0, $$1);
   }

   private static void d(aub $$0, jb $$1) {
   }

   public static void a(dmu $$0, cao $$1, @Nullable faz $$2, float $$3) {
   }

   public static void a(dmu $$0, jb $$1) {
   }

   public static void a(dmu $$0, abs $$1) {
      if ($$0 instanceof aub $$2) {
         a($$2, (abe)$$1);
      }
   }

   public static void a(dnt $$0, evg $$1) {
   }

   public static void a(dmu $$0, cao $$1, chj $$2) {
   }

   public static void a(aub $$0, Collection<cwj> $$1) {
   }

   public static void a(cam $$0) {
   }

   public static void a(cme $$0) {
   }

   public static void a(csr $$0) {
   }

   public static void a(dmu $$0, jl<ejb> $$1, fis $$2) {
   }

   public static void a(dmu $$0, ejd $$1) {
   }

   public static void a(dmu $$0, jb $$1, eeb $$2, eaw $$3) {
   }

   private static List<String> a(cam $$0, long $$1) {
      Map<cjo<?>, Optional<? extends cjn<?>>> $$2 = $$0.eh().b();
      List<String> $$3 = Lists.newArrayList();

      for (Entry<cjo<?>, Optional<? extends cjn<?>>> $$4 : $$2.entrySet()) {
         cjo<?> $$5 = $$4.getKey();
         Optional<? extends cjn<?>> $$6 = $$4.getValue();
         String $$10;
         if ($$6.isPresent()) {
            cjn<?> $$7 = (cjn<?>)$$6.get();
            Object $$8 = $$7.c();
            if ($$5 == cjo.E) {
               long $$9 = $$1 - (Long)$$8;
               $$10 = $$9 + " ticks ago";
            } else if ($$7.e()) {
               $$10 = a((aub)$$0.ai(), $$8) + " (ttl: " + $$7.b() + ")";
            } else {
               $$10 = a((aub)$$0.ai(), $$8);
            }
         } else {
            $$10 = "-";
         }

         $$3.add(mm.z.b($$5).a() + ": " + $$10);
      }

      $$3.sort(String::compareTo);
      return $$3;
   }

   private static String a(aub $$0, @Nullable Object $$1) {
      if ($$1 == null) {
         return "-";
      } else if ($$1 instanceof UUID) {
         return a($$0, $$0.b((UUID)$$1));
      } else if ($$1 instanceof cam) {
         bzm $$2 = (bzm)$$1;
         return ahi.a($$2);
      } else if ($$1 instanceof bxn) {
         return ((bxn)$$1).aj().getString();
      } else if ($$1 instanceof cjr) {
         return a($$0, ((cjr)$$1).a());
      } else if ($$1 instanceof cco) {
         return a($$0, ((cco)$$1).c());
      } else if ($$1 instanceof jk) {
         return a($$0, ((jk)$$1).b());
      } else if ($$1 instanceof ccg) {
         return a($$0, ((ccg)$$1).b());
      } else if ($$1 instanceof byb) {
         bzm $$3 = ((byb)$$1).d();
         return $$3 == null ? $$1.toString() : a($$0, $$3);
      } else if (!($$1 instanceof Collection)) {
         return $$1.toString();
      } else {
         List<String> $$4 = Lists.newArrayList();

         for (Object $$5 : (Iterable)$$1) {
            $$4.add(a($$0, $$5));
         }

         return $$4.toString();
      }
   }

   private static void a(aub $$0, abe $$1) {
      zw<?> $$2 = new aag($$1);

      for (auc $$3 : $$0.A()) {
         $$3.g.b($$2);
      }
   }
}
