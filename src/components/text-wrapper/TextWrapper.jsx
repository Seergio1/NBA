import React from "react";
import { motion, useInView } from "framer-motion";
import { useRef } from "react";
import "./TextWrapper.scss";

export const props = {
  text: "",
};

const textVariants = {
  initial: {},
  animate: {
    transition: {
      staggerChildren: 0.02,
    },
  },
};

const characterVariants = {
  initial: {
    y: "100%",
  },
  animate: {
    y: 0,
    transition: {
      ease: "circOut",
      duration: 0.6,
    },
  },
};

/**
 *
 * @param {props} param0
 * @returns
 */
export default function TextWrapper({ text }) {
  const wrapperRef = useRef();

  const inView = useInView(wrapperRef, { once: true });

  return (
    <motion.div
      ref={wrapperRef}
      variants={textVariants}
      initial="initial"
      animate={inView ? "animate" : "hidden"}
      className="text-wrapper"
    >
      {Array.from(text).map((character, index) => (
        <motion.span key={index} className="text-overflow">
          <motion.span
            variants={characterVariants}
            className={character === " " ? "space" : ""}
          >
            {character}
          </motion.span>
        </motion.span>
      ))}
    </motion.div>
  );
}
