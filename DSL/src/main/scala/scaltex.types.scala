package scaltex.types {

import scaltex.buildtools.{Areal, EntityBinding => EB, Entity, Page}

  package academic {

    trait EntityBinding extends EB {
      def § (h: String)(implicit areal: Areal): Entity
      def §§ (h: String)(implicit areal: Areal): Entity
      def §§§ (h: String)(implicit areal: Areal): Entity
      def §§§§ (h: String)(implicit areal: Areal): Entity
      def txt (t: String)(implicit areal: Areal): Entity
      def txt (t: () => String)(implicit areal: Areal): Entity
      def figure (src: String, desc: String)(implicit areal: Areal): Entity
    }

    trait Pages {
      val A4: Page
      val A4horizontal: Page
    }

    package areals {
      trait TitlePage
      trait TableOfContents
      trait Document
    }

  }

}