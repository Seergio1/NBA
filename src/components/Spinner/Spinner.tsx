import React from "react";
import "./Spinner.sass";

interface SpinnerProps {
  On: Boolean;
  size?: string;
  borderWidth?: string;
}
export const Spinner = (props: SpinnerProps) => {
  const { On, size = "0.65rem", borderWidth = "3px" } = props;
  return (
    <>{On && <div className="lds-dual-ring" style={{ width: size, height: size, borderWidth: borderWidth }}></div>}</>
  );
};

export default Spinner;
