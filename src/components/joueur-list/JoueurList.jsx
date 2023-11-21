import React from "react";
import "./JoueurList.scss";
import JoueurCard from "../joueur-card/JoueurCard";
import TextWrapper from "../text-wrapper/TextWrapper";
import { motion } from "framer-motion";

export const props = {
  stats: [
    {
      classement: "",
      joueur: {
        photo: "",
        nom: "",
        prenom: "",
      },
      equipe: "",
      match: "",
      matchJoues: "",
      pointParMatch: "",
      rebondParMatch: "",
      passeDecisiveParMatch: "",
      minuteParMatch: "",
      troisPointMoyenne: "",
      lancerFrancMoyenne: "",
    },
  ],
};

/**
 *
 * @param {props} param0
 * @returns
 */
export default function JoueurList({ stats }) {
  const listVariants = {
    initial: {},
    animate: {
      transition: {
        staggerChildren: 0.08,
        delayChildren: 1.2,
      },
    },
  };

  const itemVariants = {
    initial: {
      opacity: 0,
    },
    animate: {
      opacity: 1,
      transition: {
        duration: 0.6,
        ease: "easeInOut",
      },
    },
  };

  return (
    <motion.div
      variants={listVariants}
      initial="initial"
      animate="animate"
      className="joueur-list"
    >
      <div className="title">
        <TextWrapper text="Classement individuel des meilleurs joueurs" />
      </div>
      {stats.map((stat) => (
        <motion.div key={stat.classement} variants={itemVariants}>
          <JoueurCard stat={stat} />
        </motion.div>
      ))}
    </motion.div>
  );
}
