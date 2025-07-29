import com.mojang.serialization.Lifecycle;
import java.util.Locale;
import java.util.Set;
import javax.annotation.Nullable;

public interface fdd {
   int d = 19133;
   int e = 19132;

   dns D();

   void a(dns var1);

   boolean F();

   Set<String> G();

   Set<String> H();

   void a(String var1, boolean var2);

   default void a(q $$0) {
      $$0.a("Known server brands", () -> String.join(", ", this.G()));
      $$0.a("Removed feature flags", () -> String.join(", ", this.H()));
      $$0.a("Level was modded", () -> Boolean.toString(this.F()));
      $$0.a("Level storage version", () -> {
         int $$0x = this.x();
         return String.format(Locale.ROOT, "0x%05X - %s", $$0x, this.f($$0x));
      });
   }

   default String f(int $$0) {
      switch ($$0) {
         case 19132:
            return "McRegion";
         case 19133:
            return "Anvil";
         default:
            return "Unknown?";
      }
   }

   @Nullable
   ui E();

   void a(@Nullable ui var1);

   fcx I();

   dmy J();

   ui a(jz var1, @Nullable ui var2);

   boolean l();

   int x();

   String e();

   dmr k();

   void a(dmr var1);

   boolean m();

   bxg q();

   void a(bxg var1);

   boolean r();

   void d(boolean var1);

   dmq o();

   @Nullable
   ui w();

   eib.a C();

   void a(eib.a var1);

   eky y();

   boolean z();

   boolean A();

   Lifecycle B();

   default cyd K() {
      return this.D().b();
   }
}
