import com.mojang.serialization.MapCodec;
import java.util.Collections;
import java.util.EnumMap;
import java.util.Map;
import java.util.Optional;

public record asi(xm c) implements asd {
   public static final Map<xm.a, MapCodec<asi>> b = ag.a(() -> {
      Map<xm.a, MapCodec<asi>> $$0 = new EnumMap<>(xm.a.class);

      for (xm.a $$1 : xm.a.class.getEnumConstants()) {
         if ($$1.a()) {
            MapCodec<xm> $$2 = $$1.b();
            $$0.put($$1, $$2.xmap(asi::new, asi::b));
         }
      }

      return Collections.unmodifiableMap($$0);
   });

   @Override
   public MapCodec<asi> a() {
      return b.get(this.c.a());
   }

   @Override
   public Optional<xm> a(Map<String, asd.a> $$0) {
      return Optional.of(this.c);
   }

   public xm b() {
      return this.c;
   }
}
