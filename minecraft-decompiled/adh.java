import com.mojang.brigadier.context.StringRange;
import com.mojang.brigadier.suggestion.Suggestion;
import com.mojang.brigadier.suggestion.Suggestions;
import java.util.List;
import java.util.Optional;

public record adh(int b, int c, int d, List<adh.a> e) implements zw<acq> {
   public static final zm<wx, adh> a = zm.a(zk.h, adh::e, zk.h, adh::f, zk.h, adh::g, adh.a.a.a(zk.a()), adh::h, adh::new);

   public adh(int $$0, Suggestions $$1) {
      this(
         $$0,
         $$1.getRange().getStart(),
         $$1.getRange().getLength(),
         $$1.getList().stream().map($$0x -> new adh.a($$0x.getText(), Optional.ofNullable($$0x.getTooltip()).map(xr::a))).toList()
      );
   }

   @Override
   public zy<adh> a() {
      return ahk.q;
   }

   public void a(acq $$0) {
      $$0.a(this);
   }

   public Suggestions b() {
      StringRange $$0 = StringRange.between(this.c, this.c + this.d);
      return new Suggestions($$0, this.e.stream().map($$1 -> new Suggestion($$0, $$1.a(), $$1.b().orElse(null))).toList());
   }

   public int e() {
      return this.b;
   }

   public int f() {
      return this.c;
   }

   public int g() {
      return this.d;
   }

   public List<adh.a> h() {
      return this.e;
   }

   public record a(String b, Optional<xo> c) {
      public static final zm<wx, adh.a> a = zm.a(zk.p, adh.a::a, xq.e, adh.a::b, adh.a::new);

      public String a() {
         return this.b;
      }

      public Optional<xo> b() {
         return this.c;
      }
   }
}
