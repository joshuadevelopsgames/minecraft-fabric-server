import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public record xk(xl l, xl m) {
   public static final Codec<xk> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(xl.a.fieldOf("chat").forGetter(xk::a), xl.a.fieldOf("narration").forGetter(xk::b)).apply($$0, xk::new)
   );
   public static final zm<wx, xk> b = zm.a(xl.b, xk::a, xl.b, xk::b, xk::new);
   public static final zm<wx, jl<xk>> c = zk.a(mn.aM, b);
   public static final xl d = xl.a("chat.type.text");
   public static final amd<xk> e = a("chat");
   public static final amd<xk> f = a("say_command");
   public static final amd<xk> g = a("msg_command_incoming");
   public static final amd<xk> h = a("msg_command_outgoing");
   public static final amd<xk> i = a("team_msg_command_incoming");
   public static final amd<xk> j = a("team_msg_command_outgoing");
   public static final amd<xk> k = a("emote_command");

   private static amd<xk> a(String $$0) {
      return amd.a(mn.aM, ame.b($$0));
   }

   public static void a(qq<xk> $$0) {
      $$0.a(e, new xk(d, xl.a("chat.type.text.narrate")));
      $$0.a(f, new xk(xl.a("chat.type.announcement"), xl.a("chat.type.text.narrate")));
      $$0.a(g, new xk(xl.b("commands.message.display.incoming"), xl.a("chat.type.text.narrate")));
      $$0.a(h, new xk(xl.c("commands.message.display.outgoing"), xl.a("chat.type.text.narrate")));
      $$0.a(i, new xk(xl.d("chat.type.team.text"), xl.a("chat.type.text.narrate")));
      $$0.a(j, new xk(xl.d("chat.type.team.sent"), xl.a("chat.type.text.narrate")));
      $$0.a(k, new xk(xl.a("chat.type.emote"), xl.a("chat.type.emote")));
   }

   public static xk.a a(amd<xk> $$0, bzm $$1) {
      return a($$0, $$1.ai().K_(), $$1.Q_());
   }

   public static xk.a a(amd<xk> $$0, ek $$1) {
      return a($$0, $$1.u(), $$1.b());
   }

   public static xk.a a(amd<xk> $$0, jz $$1, xo $$2) {
      jy<xk> $$3 = $$1.f(mn.aM);
      return new xk.a($$3.b($$0), $$2);
   }

   public xl a() {
      return this.l;
   }

   public xl b() {
      return this.m;
   }

   public record a(jl<xk> b, xo c, Optional<xo> d) {
      public static final zm<wx, xk.a> a = zm.a(xk.c, xk.a::a, xq.d, xk.a::b, xq.e, xk.a::c, xk.a::new);

      a(jl<xk> $$0, xo $$1) {
         this($$0, $$1, Optional.empty());
      }

      public xo a(xo $$0) {
         return this.b.a().a().a($$0, this);
      }

      public xo b(xo $$0) {
         return this.b.a().b().a($$0, this);
      }

      public xk.a c(xo $$0) {
         return new xk.a(this.b, this.c, Optional.of($$0));
      }

      public jl<xk> a() {
         return this.b;
      }

      public xo b() {
         return this.c;
      }

      public Optional<xo> c() {
         return this.d;
      }
   }
}
