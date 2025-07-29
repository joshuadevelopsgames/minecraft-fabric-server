import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Stream;
import javax.annotation.Nullable;

public class fcj {
   private static final String a = "command_storage_";
   private final Map<String, fcj.a> b = new HashMap<>();
   private final fcm c;

   public fcj(fcm $$0) {
      this.c = $$0;
   }

   public ui a(ame $$0) {
      fcj.a $$1 = this.a($$0.b());
      return $$1 != null ? $$1.b($$0.a()) : new ui();
   }

   @Nullable
   private fcj.a a(String $$0) {
      fcj.a $$1 = this.b.get($$0);
      if ($$1 != null) {
         return $$1;
      } else {
         fcj.a $$2 = this.c.b(fcj.a.a($$0));
         if ($$2 != null) {
            this.b.put($$0, $$2);
         }

         return $$2;
      }
   }

   private fcj.a b(String $$0) {
      fcj.a $$1 = this.b.get($$0);
      if ($$1 != null) {
         return $$1;
      } else {
         fcj.a $$2 = this.c.a(fcj.a.a($$0));
         this.b.put($$0, $$2);
         return $$2;
      }
   }

   public void a(ame $$0, ui $$1) {
      this.b($$0.b()).a($$0.a(), $$1);
   }

   public Stream<ame> a() {
      return this.b.entrySet().stream().flatMap($$0 -> $$0.getValue().c($$0.getKey()));
   }

   static String c(String $$0) {
      return "command_storage_" + $$0;
   }

   static class a extends fbx {
      public static final Codec<fcj.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(Codec.unboundedMap(bbi.F, ui.a).fieldOf("contents").forGetter($$0x -> $$0x.b)).apply($$0, fcj.a::new)
      );
      private final Map<String, ui> b;

      private a(Map<String, ui> $$0) {
         this.b = new HashMap<>($$0);
      }

      private a() {
         this(new HashMap<>());
      }

      public static fby<fcj.a> a(String $$0) {
         return new fby<>(fcj.c($$0), fcj.a::new, a, bdr.i);
      }

      public ui b(String $$0) {
         ui $$1 = this.b.get($$0);
         return $$1 != null ? $$1 : new ui();
      }

      public void a(String $$0, ui $$1) {
         if ($$1.j()) {
            this.b.remove($$0);
         } else {
            this.b.put($$0, $$1);
         }

         this.e();
      }

      public Stream<ame> c(String $$0) {
         return this.b.keySet().stream().map($$1 -> ame.a($$0, $$1));
      }
   }
}
