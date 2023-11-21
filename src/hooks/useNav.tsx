import { useIonRouter } from "@ionic/react";

const useNav = () => {
  const navigation = useIonRouter();

  const to_ = (url: string) => {
    navigation.push(url, "none", "pop");
  };
  const to = (url: string) => {
    navigation.push(url, "forward", "pop");
  };

  return { to, to_ };
};

export default useNav;
