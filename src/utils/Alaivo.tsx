export const URL = "https://nba-production.up.railway.app/";
//http://192.168.43.179:8085/

const rebuildURL = (url = "") => {
  if (url.indexOf(":new/") !== -1) return url;
  else return URL + url;
};

export const alaivoGet = async (url = "", options: any) => {
  return new Promise((resolve, reject) => {
    fetch(rebuildURL(url), {
      method: "GET",
      ...options,
    })
      .then((response) => response.json())
      .then((responseData) => {
        resolve(responseData);
      })
      .catch((error) => reject(error));
  });
};

export const alaivoDelete = async (url = "", data: any, options: any) => {
  return new Promise((resolve, reject) => {
    fetch(rebuildURL(url), {
      method: "DELETE",
      body: data,
      ...options,
    })
      .then((response) => response.json())
      .then((responseData) => {
        resolve(responseData);
      })
      .catch((error) => reject(error));
  });
};

export const alaivoPut = (url = "", data: any, options: any) => {
  return new Promise((resolve, reject) => {
    fetch(rebuildURL(url), {
      method: "PUT",
      body: data,
      ...options,
    })
      .then((response) => {
        return response.json();
      })
      .then((responseData) => {
        resolve(responseData);
      })
      .catch((error) => reject(error));
  });
};

export const alaivoPost = (url = "", data: any, options: any) => {
  return new Promise((resolve, reject) => {
    fetch(rebuildURL(url), {
      method: "POST",
      body: data,
      ...options,
    })
      .then((response) => response.json())
      .then((responseData) => {
        resolve(responseData);
      })
      .catch((error) => reject(error));
  });
};
