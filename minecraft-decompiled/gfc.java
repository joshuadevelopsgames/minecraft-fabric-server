public enum gfc {
   a(
      ame.b("advancements/box_obtained"),
      ame.b("advancements/task_frame_obtained"),
      ame.b("advancements/challenge_frame_obtained"),
      ame.b("advancements/goal_frame_obtained")
   ),
   b(
      ame.b("advancements/box_unobtained"),
      ame.b("advancements/task_frame_unobtained"),
      ame.b("advancements/challenge_frame_unobtained"),
      ame.b("advancements/goal_frame_unobtained")
   );

   private final ame c;
   private final ame d;
   private final ame e;
   private final ame f;

   private gfc(final ame $$0, final ame $$1, final ame $$2, final ame $$3) {
      this.c = $$0;
      this.d = $$1;
      this.e = $$2;
      this.f = $$3;
   }

   public ame a() {
      return this.c;
   }

   public ame a(ap $$0) {
      return switch ($$0) {
         case a -> this.d;
         case b -> this.e;
         case c -> this.f;
      };
   }
}
